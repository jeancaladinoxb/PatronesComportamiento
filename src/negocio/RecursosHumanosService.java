package negocio;

import datos.entidades.Empleado;
import negocio.patrones.templatemethod.GeneradorNomina;
import negocio.patrones.templatemethod.NominaAdministrativo;
import negocio.patrones.templatemethod.NominaMedicoContratista;

public class RecursosHumanosService {

    public void generarPago(Empleado empleado, int tipoContrato) {
        GeneradorNomina generador;

        if (tipoContrato == 1) {
            generador = new NominaAdministrativo();
        } else if (tipoContrato == 2) {
            generador = new NominaMedicoContratista();
        } else {
            System.out.println("Tipo de contrato no válido.");
            return;
        }

        System.out.println("\n--- Iniciando Proceso de Nómina ---");
        // Llamado al Template Method
        generador.procesarPago(empleado);
    }
}
