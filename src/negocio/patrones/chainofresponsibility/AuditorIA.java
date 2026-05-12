package negocio.patrones.chainofresponsibility;
import datos.entidades.*;

public class AuditorIA extends BaseHandler{

    @Override

    public void handle(SolicitudMedica solicitud){

        if (solicitud.getNivelComplejidad() == 3 && solicitud.getCostoEstimado() <= 10000000){

            System.out.println("Autorización aprobada exitosamente, consulte el mensaje enviado a su correo electronico para mas informacion ");
        }else{

            System.out.println("Su solicitud será evaluada por el departamento encargado");

            super.handle(solicitud);
        }
    }

}
