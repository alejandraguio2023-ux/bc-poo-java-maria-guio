import java.util.ArrayList;

public class Biologist {
    private String name;
    private String speciality;
    private int yearsExperience;

    // 🔥 Relación: Un biólogo supervisa varios especímenes
    private ArrayList<PlantSpecimen> supervisedSpecimens;

    public Biologist(String name, String speciality, int yearsExperience) {
        this.name = name;
        this.speciality = speciality;
        this.yearsExperience = yearsExperience;
        this.supervisedSpecimens = new ArrayList<>();
    }

    // Método de negocio: supervisar una planta
    public String supervisePlant(PlantSpecimen specimen) {
        supervisedSpecimens.add(specimen);
        return "El biólogo " + name + " supervisó el espécimen " + specimen.getSpecimenCode();
    }

    // Método adicional: cuántas plantas supervisa
    public int getTotalSupervised() {
        return supervisedSpecimens.size();
    }

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public int getYearsExperience() { return yearsExperience; }
    public void setYearsExperience(int yearsExperience) { this.yearsExperience = yearsExperience; }

    public ArrayList<PlantSpecimen> getSupervisedSpecimens() {
        return supervisedSpecimens;
    }
}
