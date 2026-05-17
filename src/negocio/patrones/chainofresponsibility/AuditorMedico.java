package negocio.patrones.chainofresponsibility;
import datos.entidades.SolicitudMedica;

public class AuditorMedico extends BaseHandler {

    @Override

    public void handle(SolicitudMedica solicitud) {

        if(solicitud.getNivelComplejidad() == 2 && solicitud.getCostoEstimado() <= 30000000){

            System.out.println("Solicitud manejada por Auditor Medico, revise nuestra plataforma para consultar estado de solicitud");
        }else{
            System.out.println("La solicitud será enviada para la directiva medica con fin de aprobación o rechazo");

            super.handle(solicitud);
        }

    }

}
