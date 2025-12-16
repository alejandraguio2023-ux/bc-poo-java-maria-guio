package implementaciones;

public class VisitanteRegular6 extends Visitante {

    public VisitanteRegular6(String name, int idNumber, String phone,
                             String email, String gender, String ticketNumber) {
        super(name, idNumber, phone, email, gender, ticketNumber);
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Entrada registrada para el visitante.");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Salida registrada para el visitante.");
    }
}

