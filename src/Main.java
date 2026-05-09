import Modelo.entidades.SolicitudMedica;
import java.util.Scanner;

public class Main{

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombrePaciente = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edadPaciente = sc.nextInt();
        System.out.println("Ingrese la fehca de solicitud de autorización: ");
        int fechaSolicitud = sc.nextInt();
        System.out.println("Ingrese el nivel de complejidad (1: Alto, 2: Medio y 3: Bajo )");
        int nivelComplejidad = sc.nextInt();
        System.out.println("Ingrese el costo estimado según la taba de costos EPS: ");
        double costoEstimado = sc.nextDouble();

    }
}