public class Main3 {
    public static void main(String[] args) {

        JardinBotanicoSystem sistema = new JardinBotanicoSystem();

        sistema.agregarOrganismo(
                new Planta("Mentha spicata", "Hierbabuena", "Colombia", true, 0.4)
        );

        sistema.agregarOrganismo(
                new Arbol("Quercus robur", "Roble", "Europa", 80, 120)
        );

        sistema.agregarOrganismo(
                new Planta("Aloe vera", "Sábila", "África", true, 0.6)
        );

        sistema.procesarCuidadoGeneral();
        sistema.generarReporte();
    }
}
