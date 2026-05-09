package Modelo.Patrones.Chainofresponsibility;
import Modelo.entidades.SolicitudMedica;

public interface Handler {

    void setNext(Handler siguienteAprobador);

    void handle(SolicitudMedica peticion);

}
