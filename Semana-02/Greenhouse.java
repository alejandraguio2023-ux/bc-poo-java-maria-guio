public class Greenhouse {
    private String code;
    private String climateType;
    private int capacity;
    private int currentPlants;

    // ---------- CONSTRUCTOR VALIDADO ----------
    public Greenhouse(String code, String climateType, int capacity) {
        setCode(code);
        setClimateType(climateType);
        setCapacity(capacity);
        this.currentPlants = 0;
    }

    // ---------- MÉTODO DE NEGOCIO ----------
    public boolean addPlant() {
        if (currentPlants >= capacity) {
            System.out.println("⚠️ La invernadero " + code + " está lleno.");
            return false;
        }
        currentPlants++;
        return true;
    }

    // ---------- GETTERS ----------
    public String getCode() { return code; }
    public String getClimateType() { return climateType; }
    public int getCapacity() { return capacity; }
    public int getCurrentPlants() { return currentPlants; }

    // ---------- SETTERS CON VALIDACIÓN ----------
    public void setCode(String code) {
        if (!isValidString(code)) {
            throw new IllegalArgumentException("El código del invernadero no puede estar vacío.");
        }
        if (!code.startsWith("GH-")) {
            throw new IllegalArgumentException("El código debe iniciar con 'GH-'.");
        }
        this.code = code;
    }

    public void setClimateType(String climateType) {
        if (!isValidString(climateType)) {
            throw new IllegalArgumentException("El tipo de clima no puede estar vacío.");
        }
        this.climateType = climateType;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0 || capacity > 1000) {
            throw new IllegalArgumentException("Capacidad debe ser entre 1 y 1000.");
        }
        this.capacity = capacity;
    }

    // ---------- MÉTODO PRIVADO AUXILIAR ----------
    private boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
