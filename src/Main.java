import Modelo.Patrones.Chainofresponsibility.AuditorIA;
import Modelo.Patrones.Chainofresponsibility.AuditorMedico;
import Modelo.Patrones.Chainofresponsibility.DirectorMedico;
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
        System.out.println("Ingrese el costo estimado según la tabla de costos EPS: ");
        int costoEstimado = sc.nextInt();

        SolicitudMedica miSolicitud = new SolicitudMedica(nombrePaciente, edadPaciente, fechaSolicitud, nivelComplejidad, costoEstimado);

        AuditorIA aura = new AuditorIA();
        AuditorMedico medico = new AuditorMedico();
        DirectorMedico director = new DirectorMedico();

        System.out.println("Iniciando proceso de autorización");

        aura.setNext(medico);
        medico.setNext(director);
        aura.handle(miSolicitud);

    }
}