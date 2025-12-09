import java.util.ArrayList;

public class JardinBotanico {

    private ArrayList<Organismo> organismos;

    public JardinBotanico() {
        organismos = new ArrayList<>();
    }

    public void agregarOrganismo(Organismo o) {
        organismos.add(o);
    }

    // 🔍 Sobrecarga 1: Buscar por nombre común
    public Organismo buscar(String nombreComun) {
        for (Organismo o : organismos) {
            if (o.commonName.equalsIgnoreCase(nombreComun)) {
                return o;
            }
        }
        return null;
    }

    // 🔬 Sobrecarga 2: Buscar por nombre científico
    public Organismo buscarPorCientifico(String nombreCientifico) {
        for (Organismo o : organismos) {
            if (o.scientificName.equalsIgnoreCase(nombreCientifico)) {
                return o;
            }
        }
        return null;
    }

    // 🌍 Sobrecarga 3: Buscar por origen (retorna varios)
    public ArrayList<Organismo> buscar(String origen, boolean buscarPorOrigen) {
        ArrayList<Organismo> encontrados = new ArrayList<>();

        for (Organismo o : organismos) {
            if (o.origin.equalsIgnoreCase(origen)) {
                encontrados.add(o);
            }
        }
        return encontrados;
    }
}
