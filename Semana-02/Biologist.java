public class Biologist {
    private String name;
    private String speciality;
    private int yearsExperience;

    // ---------- CONSTRUCTOR VALIDADO ----------
    public Biologist(String name, String speciality, int yearsExperience) {
        setName(name);
        setSpeciality(speciality);
        setYearsExperience(yearsExperience);
    }

    // ---------- MÉTODO DE NEGOCIO ----------
    public String supervisePlant(PlantSpecimen specimen) {
        if (specimen == null) {
            throw new IllegalArgumentException("No se puede supervisar un espécimen nulo.");
        }

        return "El biólogo " + name +
                " supervisó el espécimen " + specimen.getSpecimenCode();
    }

    // ---------- GETTERS ----------
    public String getName() { return name; }
    public String getSpeciality() { return speciality; }
    public int getYearsExperience() { return yearsExperience; }

    // ---------- SETTERS CON VALIDACIÓN ----------
    public void setName(String name) {
        if (!isValidString(name)) {
            throw new IllegalArgumentException("El nombre del biólogo no puede estar vacío.");
        }
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        if (!isValidString(speciality)) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.speciality = speciality;
    }

    public void setYearsExperience(int yearsExperience) {
        if (yearsExperience < 0 || yearsExperience > 60) {
            throw new IllegalArgumentException("Años de experiencia debe ser entre 0 y 60.");
        }
        this.yearsExperience = yearsExperience;
    }

    // ---------- MÉTODO PRIVADO AUXILIAR ----------
    private boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
