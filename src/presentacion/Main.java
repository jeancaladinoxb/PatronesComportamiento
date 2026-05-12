package presentacion;

import datos.entidades.SolicitudMedica;
import negocio.AutorizacionService;

public class Main {
    public static void main(String[] args) {
        // Inicializamos las capas
        VistaConsola vista = new VistaConsola();
        AutorizacionService servicio = new AutorizacionService();

        // 1. Obtenemos datos del usuario (Capa de Presentación)
        SolicitudMedica miSolicitud = vista.pedirDatosSolicitud();

        // 2. Ejecutamos la lógica (Capa de Negocio)
        vista.mostrarInicioProceso();
        servicio.procesarSolicitud(miSolicitud);
    }
}