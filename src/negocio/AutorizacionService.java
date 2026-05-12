package negocio;

import datos.entidades.SolicitudMedica;
import negocio.patrones.chainofresponsibility.AuditorIA;
import negocio.patrones.chainofresponsibility.AuditorMedico;
import negocio.patrones.chainofresponsibility.DirectorMedico;
import negocio.patrones.chainofresponsibility.Handler;

public class AutorizacionService {
    private Handler cadena;

    public AutorizacionService() {
        // Configuramos la cadena de responsabilidad
        AuditorIA aura = new AuditorIA();
        AuditorMedico medico = new AuditorMedico();
        DirectorMedico director = new DirectorMedico();

        aura.setNext(medico);
        medico.setNext(director);

        this.cadena = aura;
    }

    public void procesarSolicitud(SolicitudMedica solicitud) {
        // En un esquema más avanzado, esto podría devolver un String o un Objeto Resultado
        cadena.handle(solicitud);
    }
}
