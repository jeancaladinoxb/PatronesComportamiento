package Modelo.entidades;

public class SolicitudMedica {

    private String nombrePaciente;
    private int fechaSolicitud;
    private int edadPaciente;
    private int nivelComplejidad;
    private double costoEstimado;


    public SolicitudMedica(String nombrePaciente,int fechaSolicitud, int edadPaciente, int nivelComplejidad, double costoEstimado) {
        this.nombrePaciente = nombrePaciente;
        this.fechaSolicitud = fechaSolicitud;
        this.edadPaciente = edadPaciente;
        this.nivelComplejidad = nivelComplejidad;
        this.costoEstimado = costoEstimado;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }
}