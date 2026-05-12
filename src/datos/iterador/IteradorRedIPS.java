package datos.iterador;

import datos.entidades.IPS;
import java.util.List;

public class IteradorRedIPS implements Iterador {
    private List<IPS> ipsList;
    private int posicion = 0;

    public IteradorRedIPS(List<IPS> ipsList) {
        this.ipsList = ipsList;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < ipsList.size();
    }

    @Override
    public Object siguiente() {
        if (this.tieneSiguiente()) {
            IPS ips = ipsList.get(posicion);
            posicion++;
            return ips;
        }
        return null;
    }
}
