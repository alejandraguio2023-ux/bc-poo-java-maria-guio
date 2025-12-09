import java.util.ArrayList;

public class JardinBotanicoSystem {

    private ArrayList<Organismo> organismos;

    public JardinBotanicoSystem() {
        this.organismos = new ArrayList<>();
    }

    // Método polimórfico: acepta cualquier Organismo
    public void agregarOrganismo(Organismo organismo) {
        organismos.add(organismo);
        System.out.println("Organismo agregado: " + organismo.commonName + " 🌿");
    }

    // Método polimórfico: llama métodos sobrescritos
    public void procesarCuidado(Organismo organismo) {
        System.out.println("\n>>> Procesando cuidado para: " + organismo.commonName);
        organismo.mostrarInfo();   // Dynamic binding
        organismo.respirar();      // Polimorfismo total
    }

    // Método polimórfico: procesa todos
    public void procesarCuidadoGeneral() {
        System.out.println("\n=== CUIDADOS GENERALES DEL JARDÍN ===");
        for (Organismo org : organismos) {
            procesarCuidado(org);
            System.out.println("-----------------------------------");
        }
    }

    // Método polimórfico: genera un reporte
    public void generarReporte() {
        System.out.println("\n=== REPORTE DE ORGANISMOS DEL JARDÍN ===");
        for (Organismo org : organismos) {
            System.out.println("> " + org.commonName + " (" + org.scientificName + ")");
        }
    }
}
