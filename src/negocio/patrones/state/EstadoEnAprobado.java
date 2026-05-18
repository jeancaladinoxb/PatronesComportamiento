package negocio.patrones.state;

import datos.entidades.SolicitudMedica;

public class EstadoEnAprobado implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudMedica solicitud) {
        System.out.println("Operación denegada: La solicitud ya fue APROBADA y finalizó su proceso.");
    }

    @Override
    public void aprobar(SolicitudMedica solicitud) {
        System.out.println("Aviso: La solicitud ya se encuentra en estado APROBADO. No es necesario repetir la acción.");
    }

    @Override
    public void rechazar(SolicitudMedica solicitud) {
        System.out.println("¡Error de sistema! No se puede rechazar una solicitud que ya cuenta con la aprobación final.");
    }
}