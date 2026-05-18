package negocio.patrones.state;

import datos.entidades.SolicitudMedica;

public class EstadoPendiente implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudMedica solicitud) {
        System.out.println("La solicitud ha sido recibida y ahora pasa a la etapa de revisión.");
        // Aquí ocurre la magia: cambiamos el estado de la solicitud
        solicitud.setEstado(new EstadoEnRevision());
    }

    @Override
    public void aprobar(SolicitudMedica solicitud) {
        // Nos protegemos: una solicitud pendiente no se puede aprobar mágicamente
        System.out.println("¡Error! No se puede aprobar una solicitud que apenas está pendiente. Debe ser revisada primero.");
    }

    @Override
    public void rechazar(SolicitudMedica solicitud) {
        System.out.println("La solicitud ha sido rechazada inmediatamente (ej. faltan datos básicos).");
        // Cambiamos el estado a rechazado
        solicitud.setEstado(new EstadoRechazado());
    }
}
