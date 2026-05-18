package negocio.patrones.state;

import datos.entidades.SolicitudMedica;

public interface EstadoSolicitud {

    // Acción para iniciar el proceso de la solicitud en la EPS
    void procesar(SolicitudMedica solicitud);

    // Acción para dar el visto bueno (Aura, Médico o Director)
    void aprobar(SolicitudMedica solicitud);

    // Acción para rechazar la solicitud si no cumple requisitos
    void rechazar(SolicitudMedica solicitud);
}
