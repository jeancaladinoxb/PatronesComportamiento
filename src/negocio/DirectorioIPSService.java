package negocio;

import datos.entidades.IPS;
import datos.iterador.Iterador;
import datos.iterador.RedIPS;

public class DirectorioIPSService {
    private RedIPS redSedes;

    public DirectorioIPSService() {
        // Simulamos la carga de datos desde una base de datos
        redSedes = new RedIPS();
        redSedes.agregarIPS(new IPS("Hospital Central", "Calle 123 #45-67", "Urgencias y Especialidades"));
        redSedes.agregarIPS(new IPS("Clínica del Norte", "Av. Norte 89", "Maternidad y Pediatría"));
        redSedes.agregarIPS(new IPS("Centro Médico Sur", "Carrera 5 #10-20", "Consulta Externa"));
        redSedes.agregarIPS(new IPS("Laboratorio Alfa", "Diagonal 22 #33", "Laboratorio Clínico"));
    }

    public Iterador obtenerIteradorDeSedes() {
        return redSedes.crearIterador();
    }
}
