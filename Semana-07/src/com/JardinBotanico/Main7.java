package com.JardinBotanico;

import com.JardinBotanico.modelo.*;
import com.JardinBotanico.servicio.GardenManager;
import com.JardinBotanico.excepciones.*;

public class Main7 {

    public static void main(String[] args) {

        System.out.println("=== Botanical Garden System - Week 07 ===\n");

        GardenManager manager = new GardenManager();

        PlantSpecimen7 rose = new PlantSpecimen7(
                "Rosa indica", "Rose", "Asia");

        PlantSpecimen7 invalid = new PlantSpecimen7(
                "rosa", "Unknown", "Unknown");

        // Caso 1: exitoso
        try {
            manager.addCareSchedule(rose, 3);
        } catch (Exception e) {
            System.err.println("❌ " + e.getMessage());
        }

        // Caso 2: nombre científico inválido
        try {
            manager.addCareSchedule(invalid, 4);
        } catch (InvalidPlantException e) {
            System.err.println("❌ Invalid plant: " + e.getMessage());
        } catch (CareScheduleException e) {
            System.err.println(e.getMessage());
        }

        // Caso 3: frecuencia inválida
        try {
            manager.addCareSchedule(rose, -2);
        } catch (IllegalArgumentException e) {
            System.err.println("❌ " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // Caso 4: llenar capacidad
        try {
            manager.addCareSchedule(
                    new PlantSpecimen7("Lilium candidum", "Lily", "Europe"), 2);
            manager.addCareSchedule(
                    new PlantSpecimen7("Tulipa gesneriana", "Tulip", "Asia"), 5);
        } catch (Exception e) {
            System.err.println("❌ " + e.getMessage());
        }

        // Caso 5: recuperación
        try {
            manager.addCareSchedule(
                    new PlantSpecimen7("Orchis mascula", "Orchid", "Europe"), 7);
        } catch (Exception e) {
            System.err.println("❌ " + e.getMessage());
        }

        System.out.println("\n✅ Week 07 completed successfully");
    }
}
