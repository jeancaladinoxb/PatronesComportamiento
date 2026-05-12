package datos.entidades;

public class IPS {
    private String nombre;
    private String direccion;
    private String especialidad;

    public IPS(String nombre, String direccion, String especialidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
