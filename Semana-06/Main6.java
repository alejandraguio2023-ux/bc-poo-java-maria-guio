import implementaciones.Planta6;
import implementaciones.VisitanteRegular6;

public class Main6 {

    public static void main(String[] args) {

        System.out.println("=== Jardín Botánico ===");

        // Organismo
        Planta6 planta = new Planta6(
                "Ficus benjamina",
                "Ficus",
                "Colombia"
        );

        planta.mostrarInfo();
        planta.definirOrganismo();
        planta.respirar();

        System.out.println("Temperatura: " + planta.medirTemperatura());
        System.out.println("Humedad: " + planta.medirHumedad());
        System.out.println("Luminosidad: " + planta.medirLuminosidad());

        System.out.println();

        // Visitante
        VisitanteRegular6 visitante = new VisitanteRegular6(
                "Carlos Pérez",
                123456,
                "3001234567",
                "carlos@email.com",
                "Masculino",
                "TCK-001"
        );

        visitante.showInfo();
        visitante.showRole();
        visitante.print();
        visitante.registrarEntrada();
        visitante.registrarSalida();
        visitante.save();
    }
}
