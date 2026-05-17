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

        // 4. Ejecutamos la lógica (Capa de Negocio - Patrón Chain of Responsibility)
        vista.mostrarInicioProceso();
        servicio.procesarSolicitud(miSolicitud);
    }
}