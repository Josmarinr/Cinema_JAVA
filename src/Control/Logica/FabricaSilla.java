
package Control.Logica;

import Modelo.SillaTipo;

public class FabricaSilla {

    public static SillaTipo getSillaTipo(String tipo, String estado) {
        SillaTipo result = new SillaTipo(tipo, estado);
        return result;
    }
}
