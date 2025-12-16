package com.JardinBotanico.servicio;

import com.JardinBotanico.modelo.*;
import com.JardinBotanico.excepciones.*;

import java.util.ArrayList;

public class GardenManager {

    private ArrayList<CareSchedule7> schedules = new ArrayList<>();
    private int maxPlants = 3;

    /**
     * Adds a care schedule to the garden
     */
    public void addCareSchedule(PlantSpecimen7 plant, int frequency)
            throws InvalidPlantException, CareScheduleException {

        if (!plant.getScientificName().matches("[A-Z][a-z]+ [a-z]+")) {
            throw new InvalidPlantException(
                    "Scientific name must follow binomial nomenclature"
            );
        }

        if (schedules.size() >= maxPlants) {
            throw new CareScheduleException(
                    "Garden has reached maximum plant capacity"
            );
        }

        CareSchedule7 schedule = new CareSchedule7(plant, frequency);
        schedules.add(schedule);

        System.out.println("Care schedule added: " + schedule);
    }
}

