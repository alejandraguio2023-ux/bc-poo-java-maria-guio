package implementaciones;

import abstractas.Organismo6;
import interfaces.Monitorizable;

public class Planta6 extends Organismo6 implements Monitorizable {

    public Planta6(String scientificName, String commonName, String origin) {
        super(scientificName, commonName, origin);
    }

    @Override
    public void definirOrganismo() {
        System.out.println(commonName + " es una planta.");
    }

    @Override
    public double medirTemperatura() {
        return 22.5;
    }

    @Override
    public double medirHumedad() {
        return 60.0;
    }

    @Override
    public double medirLuminosidad() {
        return 800;
    }
}

