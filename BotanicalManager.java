import java.util.ArrayList;

public class BotanicalManager {
    private String gardenName;
    private ArrayList<PlantSpecimen> specimens;

    public BotanicalManager(String gardenName) {
        this.gardenName = gardenName;
        this.specimens = new ArrayList<>();
    }

    // Agregar un espécimen al listado
    public void addSpecimen(PlantSpecimen specimen) {
        specimens.add(specimen);
    }

    // Mostrar todos los especímenes registrados
    public void showAllSpecimens() {
        System.out.println("=== Especímenes registrados en: " + gardenName + " ===");
        for (PlantSpecimen s : specimens) {
            s.showInfo();
        }
    }

    // Contar cuántos especímenes hay
    public int countSpecimens() {
        return specimens.size();
    }
}
