public class Main2 {
    public static void main(String[] args) {

        Organismo[] organismos = new Organismo[3];

        organismos[0] = new Planta(
                "Mentha spicata",
                "Hierbabuena",
                "Colombia",
                true,
                0.4
        );

        organismos[1] = new Arbol(
                "Quercus robur",
                "Roble",
                "Europa",
                80,
                120
        );

        organismos[2] = new Planta(
                "Aloe vera",
                "Sábila",
                "África",
                true,
                0.6
        );

        for (Organismo org : organismos) {
            org.mostrarInfo();
            org.respirar();
            System.out.println("---------------");
        }
    }
}
