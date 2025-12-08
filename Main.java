public class Main {
    public static void main(String[] args) {

        PlantSpecimen s1 = new PlantSpecimen("PLANT-001", "Cattleya trianae", "Colombia");
        PlantSpecimen s2 = new PlantSpecimen("PLANT-002", "Quercus humboldtii", "Colombia");
        PlantSpecimen s3 = new PlantSpecimen("PLANT-003", "Espeletia grandiflora", "Páramos Colombianos");
        PlantSpecimen s4 = new PlantSpecimen("PLANT-004", "Heliconia rostrata", "Amazonía");
        PlantSpecimen s5 = new PlantSpecimen("PLANT-005", "Ceiba pentandra", "Región Caribe");

        // Mostrar info de todos los especímenes
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();

        // Crear un biólogo
        Biologist b1 = new Biologist("Laura Gómez", "Orquídeas", 5);

        // Llamar al método supervisePlant()
        System.out.println(b1.supervisePlant(s1));

        // Crear clase gestora
        BotanicalManager manager = new BotanicalManager("Flora Colombiana");

        manager.addSpecimen(s1);
        manager.addSpecimen(s2);
        manager.addSpecimen(s3);

        manager.showAllSpecimens();
        System.out.println("Total registrados: " + manager.countSpecimens());
    }
}
