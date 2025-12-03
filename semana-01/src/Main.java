public class Main {
    public static void main(String[] args) {

        PlantSpecimen planta1 = new PlantSpecimen(
                "Monstera deliciosa",
                "Costilla de Adán",
                "México"
        );

        PlantSpecimen planta2 = new PlantSpecimen(
                "Ficus lyrata",
                "Ficus",
                "África Occidental"
        );

        System.out.println("=== Catálogo de Plantas ===");
        planta1.mostrarInfo();
        System.out.println();
        planta2.mostrarInfo();
    }
}
