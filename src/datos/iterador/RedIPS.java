package datos.iterador;

import datos.entidades.IPS;
import java.util.ArrayList;
import java.util.List;

public class RedIPS implements Coleccion {
    private List<IPS> sedes;

    public RedIPS() {
        sedes = new ArrayList<>();
    }

    public void agregarIPS(IPS ips) {
        sedes.add(ips);
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorRedIPS(sedes);
    }
}
