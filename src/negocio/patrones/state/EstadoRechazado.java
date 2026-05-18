package negocio.patrones.state;

import datos.entidades.SolicitudMedica;

public class EstadoRechazado implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudMedica solicitud) {
        System.out.println("Operación denegada: La solicitud fue RECHAZADA y no puede volver a ser procesada.");
    }

    @Override
    public void aprobar(SolicitudMedica solicitud) {
        System.out.println("¡Error crítico! No se puede aprobar una solicitud que ya se encuentra en estado RECHAZADO.");
    }

    @Override
    public void rechazar(SolicitudMedica solicitud) {
        System.out.println("Aviso: La solicitud ya se encuentra en estado RECHAZADO. No es necesario repetir la acción.");
    }
}