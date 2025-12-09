public class PlantSpecimen {
    private String specimenCode;
    private String scientificName;
    private String origin;

    // ---------- CONSTRUCTOR VALIDADO ----------
    public PlantSpecimen(String specimenCode, String scientificName, String origin) {
        setSpecimenCode(specimenCode);
        setScientificName(scientificName);
        setOrigin(origin);
    }

    // ---------- MÉTODO DE NEGOCIO ----------
    public void showInfo() {
        System.out.println("Código: " + specimenCode);
        System.out.println("Nombre Científico: " + scientificName);
        System.out.println("Origen: " + origin);
    }

    // ---------- GETTERS ----------
    public String getSpecimenCode() { return specimenCode; }
    public String getScientificName() { return scientificName; }
    public String getOrigin() { return origin; }

    // ---------- SETTERS CON VALIDACIÓN REAL ----------
    public void setSpecimenCode(String specimenCode) {
        if (!isValidString(specimenCode)) {
            throw new IllegalArgumentException("Código inválido: no puede estar vacío.");
        }
        if (!specimenCode.startsWith("PLANT-")) {
            throw new IllegalArgumentException("Código debe iniciar con 'PLANT-'.");
        }
        this.specimenCode = specimenCode;
    }

    public void setScientificName(String scientificName) {
        if (!isValidString(scientificName)) {
            throw new IllegalArgumentException("Nombre científico inválido.");
        }
        if (!scientificName.contains(" ")) {
            throw new IllegalArgumentException("El nombre científico debe tener por lo menos dos palabras.");
        }
        this.scientificName = scientificName;
    }

    public void setOrigin(String origin) {
        if (!isValidString(origin)) {
            throw new IllegalArgumentException("Origen inválido.");
        }
        this.origin = origin;
    }

    // ---------- MÉTODO AUXILIAR PRIVADO ----------
    private boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
