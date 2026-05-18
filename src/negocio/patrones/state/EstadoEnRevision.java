package negocio.patrones.state;

import datos.entidades.SolicitudMedica;

public class EstadoEnRevision implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudMedica solicitud) {
        // Ya está en revisión, no avanzamos a ningún lado nuevo
        System.out.println("La solicitud ya se encuentra actualmente en revisión por el sistema IA o el auditor médico.");
    }

    @Override
    public void aprobar(SolicitudMedica solicitud) {
        System.out.println("Evaluación finalizada: La solicitud ha superado los filtros y ha sido APROBADA.");
        // ¡Éxito! Cambiamos al estado final de aprobación
        solicitud.setEstado(new EstadoEnAprobado());
    }

    @Override
    public void rechazar(SolicitudMedica solicitud) {
        System.out.println("Evaluación finalizada: La solicitud no cumple los criterios y ha sido RECHAZADA.");
        // Falla en la validación, pasa a estado rechazado
        solicitud.setEstado(new EstadoRechazado());
    }
}
