package presentacion;

import datos.entidades.SolicitudMedica;
import datos.entidades.IPS;
import datos.entidades.Empleado;
import datos.iterador.Iterador;
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

    public boolean preguntarSiVerSedes() {
        System.out.println("\n¿Desea ver el directorio de sedes de la EPS? (S/N): ");
        String respuesta = sc.nextLine();
        return respuesta.trim().equalsIgnoreCase("S");
    }

    public void mostrarSedesIPS(Iterador iterador) {
        System.out.println("\n--- Directorio de Sedes (IPS) ---");
        while (iterador.tieneSiguiente()) {
            IPS sede = (IPS) iterador.siguiente();
            System.out.println("- " + sede.getNombre() + " | " + sede.getDireccion() + " (" + sede.getEspecialidad() + ")");
        }
        System.out.println("---------------------------------");
    }

    public boolean preguntarSiProcesarNomina() {
        System.out.println("\n¿Desea acceder al módulo de Recursos Humanos para generar un pago? (S/N): ");
        String respuesta = sc.nextLine();
        return respuesta.trim().equalsIgnoreCase("S");
    }

    public Empleado pedirDatosEmpleado() {
        System.out.println("\n--- Módulo de Nómina ---");
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la identificación: ");
        String identificacion = sc.nextLine();
        
        System.out.println("Ingrese el salario base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer
        
        return new Empleado(nombre, identificacion, salarioBase);
    }

    public int pedirTipoContrato() {
        System.out.println("Seleccione el tipo de contrato:");
        System.out.println("1. Administrativo (Deducción salud y pensión)");
        System.out.println("2. Médico Contratista (Retención en la fuente)");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        return opcion;
    }
}
