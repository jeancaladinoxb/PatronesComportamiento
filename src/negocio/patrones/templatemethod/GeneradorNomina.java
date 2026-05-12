package negocio.patrones.templatemethod;

import datos.entidades.Empleado;

public abstract class GeneradorNomina {

    // Este es el Template Method que define el esqueleto del algoritmo
    public final void procesarPago(Empleado empleado) {
        double salarioBase = calcularBase(empleado);
        double deducciones = aplicarDeducciones(salarioBase);
        double salarioFinal = salarioBase - deducciones;
        emitirPago(empleado, salarioFinal);
    }

    // Paso común para todos (calculo inicial)
    protected double calcularBase(Empleado empleado) {
        System.out.println("1. Obteniendo salario base para " + empleado.getNombre() + ": $" + empleado.getSalarioBase());
        return empleado.getSalarioBase();
    }

    // Paso específico que debe ser sobrescrito por cada subclase (hook method)
    protected abstract double aplicarDeducciones(double salarioBase);

    // Paso común para todos (emisión del pago)
    protected void emitirPago(Empleado empleado, double salarioFinal) {
        System.out.println("3. Emitiendo pago final a " + empleado.getNombre() + " (CC: " + empleado.getIdentificacion() + ") por: $" + salarioFinal);
        System.out.println("-------------------------------------------------");
    }
}
