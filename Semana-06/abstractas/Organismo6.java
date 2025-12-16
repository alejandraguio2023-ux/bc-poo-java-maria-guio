package abstractas;

public abstract class Organismo6 {
    protected String scientificName;
    protected String commonName;
    protected String origin;

    public Organismo6(String scientificName, String commonName, String origin) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.origin = origin;
    }

    public void mostrarInfo() {
        System.out.println("Nombre científico: " + scientificName);
        System.out.println("Nombre común: " + commonName);
        System.out.println("Origen: " + origin);
    }

    public void respirar() {
        System.out.println(commonName + " está realizando intercambio gaseoso 🌿");
    }

    public abstract void definirOrganismo();

}
