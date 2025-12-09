public class Arbol extends Organismo {

    private int edad;          // años
    private double diametroTronco; // cm

    public Arbol(String scientificName, String commonName, String origin,
                 int edad, double diametroTronco) {
        super(scientificName, commonName, origin);
        this.edad = edad;
        this.diametroTronco = diametroTronco;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Edad: " + edad + " años");
        System.out.println("Diámetro del tronco: " + diametroTronco + " cm");
    }

    @Override
    public void respirar() {
        System.out.println(commonName + " está liberando oxígeno como un campeón 🌳💨");
    }
}
