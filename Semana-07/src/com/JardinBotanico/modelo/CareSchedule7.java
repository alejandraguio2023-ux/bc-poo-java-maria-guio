package com.JardinBotanico.modelo;

public class CareSchedule7 {

    private PlantSpecimen7 plant;
    private int wateringFrequency; // días

    public CareSchedule7(PlantSpecimen7 plant, int wateringFrequency) {
        if (plant == null) {
            throw new IllegalArgumentException("Plant specimen cannot be null");
        }
        if (wateringFrequency <= 0) {
            throw new IllegalArgumentException("Watering frequency must be positive");
        }

        this.plant = plant;
        this.wateringFrequency = wateringFrequency;
    }

    public PlantSpecimen7 getPlant() {
        return plant;
    }

    @Override
    public String toString() {
        return "Care every " + wateringFrequency + " days for " + plant;
    }
}
