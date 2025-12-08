import java.util.ArrayList;

public class Greenhouse {
    private String code;
    private String climateType;
    private int capacity;

    // 🔥 Relación con PlantSpecimen (AGREGACIÓN)
    private ArrayList<PlantSpecimen> specimens;

    public Greenhouse(String code, String climateType, int capacity) {
        this.code = code;
        this.climateType = climateType;
        this.capacity = capacity;
        this.specimens = new ArrayList<>(); // inicia lista vacía
    }

    // Método de negocio: agregar una planta al invernadero
    public boolean addSpecimen(PlantSpecimen specimen) {
        if (specimens.size() < capacity) {
            specimens.add(specimen);
            return true;
        }
        return false; // está lleno
    }

    // Método adicional: conocer cuántas plantas hay
    public int getTotalSpecimens() {
        return specimens.size();
    }

    // Getters y setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getClimateType() { return climateType; }
    public void setClimateType(String climateType) { this.climateType = climateType; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public ArrayList<PlantSpecimen> getSpecimens() {
        return specimens;
    }
}
