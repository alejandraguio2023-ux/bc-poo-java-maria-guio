public class Planta extends Organismo {

    private boolean esAromatica;
    private double altura;  // metros

    public Planta(String scientificName, String commonName, String origin,
                  boolean esAromatica, double altura) {
        super(scientificName, commonName, origin);
        this.esAromatica = esAromatica;
        this.altura = altura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es aromática: " + (esAromatica ? "Sí" : "No"));
        System.out.println("Altura: " + altura + " m");
    }

    @Override
    public void respirar() {
        System.out.println(commonName + " está haciendo fotosíntesis ☀️🍃");
    }
}
