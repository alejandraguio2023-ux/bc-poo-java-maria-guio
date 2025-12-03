public class PlantSpecimen {

    String nombreCientifico;
    String nombreComun;
    String origen;

    public PlantSpecimen(String nombreCientifico, String nombreComun, String origen) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.origen = origen;
    }

    public void mostrarInfo() {
        System.out.println("Nombre científico: " + nombreCientifico);
        System.out.println("Nombre común: " + nombreComun);
        System.out.println("Origen: " + origen);
    }

    public static void main(String[] args) {
        PlantSpecimen planta1 = new PlantSpecimen("Monstera deliciosa", "Costilla de Adán", "México");
        planta1.mostrarInfo();
    }
}
