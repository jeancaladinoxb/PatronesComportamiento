package negocio.patrones.chainofresponsibility;
import datos.entidades.SolicitudMedica;

public interface Handler {

    void setNext(Handler siguienteAprobador);

    void handle(SolicitudMedica peticion);

}
