package datos.entidades;

// Importamos la interfaz y el estado inicial del paquete state
import negocio.patrones.state.EstadoSolicitud;
import negocio.patrones.state.EstadoPendiente;

public class SolicitudMedica {

    // Tus atributos actuales
    private String nombrePaciente;
    private int fechaSolicitud;
    private int edadPaciente;
    private int nivelComplejidad;
    private int costoEstimado;

    // Atributo clave del patrón State: guarda el estado actual de la solicitud
    private EstadoSolicitud estadoActual;

    // Tu constructor actual adaptado para inicializar el estado
    public SolicitudMedica(String nombrePaciente, int fechaSolicitud, int edadPaciente, int nivelComplejidad, int costoEstimado) {
        this.nombrePaciente = nombrePaciente;
        this.fechaSolicitud = fechaSolicitud;
        this.edadPaciente = edadPaciente;
        this.nivelComplejidad = nivelComplejidad;
        this.costoEstimado = costoEstimado;

        // Regla de negocio: Toda nueva solicitud nace automáticamente en estado PENDIENTE
        this.estadoActual = new EstadoPendiente();
    }

    // Métodos para cambiar y consultar el objeto de estado
    public void setEstado(EstadoSolicitud nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public EstadoSolicitud getEstadoActual() {
        return this.estadoActual;
    }

    // ============================================================
    // MÉTODOS DEL PATRÓN STATE (DELEGACIÓN RECEPTIVA)
    // ============================================================

    public void procesar() {
        // La solicitud le delega el comportamiento a su estado del momento
        this.estadoActual.procesar(this);
    }

    public void aprobar() {
        this.estadoActual.aprobar(this);
    }

    public void rechazar() {
        this.estadoActual.rechazar(this);
    }

    // ============================================================
    // TUS GETTERS ANTERIORES (Sanos y salvos)
    // ============================================================

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getFechaSolicitud() {
        return fechaSolicitud;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }

    public int getCostoEstimado() {
        return costoEstimado;
    }
}