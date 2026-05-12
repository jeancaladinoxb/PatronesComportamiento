package datos.entidades;

public class Empleado {
    private String nombre;
    private String identificacion;
    private double salarioBase;

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
