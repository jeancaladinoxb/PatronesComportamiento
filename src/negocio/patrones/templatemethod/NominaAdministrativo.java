package negocio.patrones.templatemethod;

public class NominaAdministrativo extends GeneradorNomina {

    @Override
    protected double aplicarDeducciones(double salarioBase) {
        // Para administrativos, digamos que se descuenta el 8% (4% salud, 4% pensión)
        double porcentajeDescuento = 0.08;
        double deducciones = salarioBase * porcentajeDescuento;
        System.out.println("2. Aplicando deducciones de ley (Salud y Pensión - 8%): -$" + deducciones);
        return deducciones;
    }
}
