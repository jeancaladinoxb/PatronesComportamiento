package Modelo.Patrones.Chainofresponsibility;

import Modelo.entidades.SolicitudMedica;

public class DirectorMedico extends BaseHandler{

    @Override

    public void handle(SolicitudMedica solicitud){

        if(solicitud.getNivelComplejidad() == 1 && solicitud.getCostoEstimado() <= 80000000){

            System.out.println("Solicitud encargada a la directiva Medica, porfavor revise la Pagina para consultar el estado de su soliciutd");
        }
    }

}
