package presentacion;

import datos.entidades.SolicitudMedica;
import datos.entidades.Empleado;
import negocio.AutorizacionService;
import negocio.DirectorioIPSService;
import negocio.RecursosHumanosService;

public class Main {
    public static void main(String[] args) {
        // Inicializamos las capas
        VistaConsola vista = new VistaConsola();
        AutorizacionService servicio = new AutorizacionService();

        // 1. Obtenemos datos del usuario (Capa de Presentación)
        SolicitudMedica miSolicitud = vista.pedirDatosSolicitud();

        // 2. Mostrar directorio de IPS (Patrón Iterator)
        DirectorioIPSService directorioService = new DirectorioIPSService();
        if (vista.preguntarSiVerSedes()) {
            vista.mostrarSedesIPS(directorioService.obtenerIteradorDeSedes());
        }

        // 3. Módulo de Recursos Humanos (Patrón Template Method)
        if (vista.preguntarSiProcesarNomina()) {
            Empleado empleado = vista.pedirDatosEmpleado();
            int tipoContrato = vista.pedirTipoContrato();

            RecursosHumanosService rrhhService = new RecursosHumanosService();
            rrhhService.generarPago(empleado, tipoContrato);
        }

        vista.mostrarInicioProceso();

        miSolicitud.procesar();

        // Se ejecuta tu Cadena de Responsabilidad (AuditorIA -> AuditorMedico -> DirectorMedico)
        servicio.procesarSolicitud(miSolicitud);

        // Consultamos en qué estado terminó la solicitud después de toda la evaluación
        System.out.println("\n[SISTEMA] Evaluación concluida.");
        System.out.println("El estado definitivo de la solicitud es: "
                + miSolicitud.getEstadoActual().getClass().getSimpleName());
    }
}