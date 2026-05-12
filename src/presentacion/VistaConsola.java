package presentacion;

import datos.entidades.SolicitudMedica;
import java.util.Scanner;

public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        this.sc = new Scanner(System.in);
    }

    public SolicitudMedica pedirDatosSolicitud() {
        System.out.println("--- Sistema de Autorización EPS ---");
        System.out.println("Ingrese su nombre: ");
        String nombrePaciente = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edadPaciente = sc.nextInt();
        
        System.out.println("Ingrese la fecha de solicitud (ej. 20240512): ");
        int fechaSolicitud = sc.nextInt();
        
        System.out.println("Ingrese el nivel de complejidad (1: Alto, 2: Medio, 3: Bajo): ");
        int nivelComplejidad = sc.nextInt();
        
        System.out.println("Ingrese el costo estimado: ");
        int costoEstimado = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        return new SolicitudMedica(nombrePaciente, fechaSolicitud, edadPaciente, nivelComplejidad, costoEstimado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarInicioProceso() {
        System.out.println("\n>>> Iniciando proceso de autorización...");
    }
}
