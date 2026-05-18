package negocio.patrones.chainofresponsibility;
import datos.entidades.SolicitudMedica;

public class AuditorMedico extends BaseHandler {

    @Override

    public void handle(SolicitudMedica solicitud) {

        if(solicitud.getNivelComplejidad() == 2 && solicitud.getCostoEstimado() <= 30000000){

            System.out.println("Solicitud manejada por Auditor Medico, revise nuestra plataforma para consultar estado de solicitud");
            solicitud.procesar();
            super.handle(solicitud);
        }

    }

}
