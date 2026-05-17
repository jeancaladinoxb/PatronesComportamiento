package negocio.patrones.chainofresponsibility;
import datos.entidades.SolicitudMedica;


public abstract class BaseHandler implements Handler {

        protected Handler siguienteAprobado;

        @Override

        public void setNext(Handler siguienteAprobado) {

            this.siguienteAprobado = siguienteAprobado;
        }
        @Override
        public void handle(SolicitudMedica solicitudMedica) {

            if (this.siguienteAprobado != null) {

                this.siguienteAprobado.handle(solicitudMedica);
            }else{

                System.out.println("Ningun nivel pudo aprobar la solicitud de: " + solicitudMedica.getNombrePaciente());
            }
        }

    }
