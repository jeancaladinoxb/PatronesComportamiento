package negocio.patrones.templatemethod;

public class NominaMedicoContratista extends GeneradorNomina {

    @Override
    protected double aplicarDeducciones(double salarioBase) {
        // Para contratistas, se aplica una retención en la fuente del 11%
        double retencionFuente = 0.11;
        double deducciones = salarioBase * retencionFuente;
        System.out.println("2. Aplicando retención en la fuente (Contrato Prestación de Servicios - 11%): -$" + deducciones);
        return deducciones;
    }
}
