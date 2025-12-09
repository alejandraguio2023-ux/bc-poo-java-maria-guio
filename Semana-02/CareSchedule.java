public class    CareSchedule {
    private PlantSpecimen specimen;
    private Biologist biologist;
    private String frequency;
    private String careType;

    public CareSchedule(PlantSpecimen specimen, Biologist biologist, String frequency, String careType) {
        this.specimen = specimen;
        this.biologist = biologist;
        this.frequency = frequency;
        this.careType = careType;
    }

    // Método de negocio
    public String generateReport() {
        return "Plan de cuidado para " + specimen.getScientificName() +
                " | Biólogo: " + biologist.getName() +
                " | Frecuencia: " + frequency +
                " | Tipo de cuidado: " + careType;
    }

    // Getters y setters
    public PlantSpecimen getSpecimen() { return specimen; }
    public void setSpecimen(PlantSpecimen specimen) { this.specimen = specimen; }

    public Biologist getBiologist() { return biologist; }
    public void setBiologist(Biologist biologist) { this.biologist = biologist; }

    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }

    public String getCareType() { return careType; }
    public void setCareType(String careType) { this.careType = careType; }
}
