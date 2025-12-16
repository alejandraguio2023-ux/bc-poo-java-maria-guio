package com.JardinBotanico.modelo;

public class PlantSpecimen7 {

    private String scientificName;
    private String commonName;
    private String origin;

    public PlantSpecimen7(String scientificName, String commonName, String origin) {
        if (scientificName == null || scientificName.isEmpty()) {
            throw new IllegalArgumentException("Scientific name cannot be empty");
        }
        if (commonName == null || commonName.isEmpty()) {
            throw new IllegalArgumentException("Common name cannot be empty");
        }
        if (origin == null || origin.isEmpty()) {
            throw new IllegalArgumentException("Origin cannot be empty");
        }

        this.scientificName = scientificName;
        this.commonName = commonName;
        this.origin = origin;
    }

    public String getScientificName() {
        return scientificName;
    }

    @Override
    public String toString() {
        return scientificName + " (" + commonName + ") - Origin: " + origin;
    }
}

