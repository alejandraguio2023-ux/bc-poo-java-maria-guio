package implementaciones;
import abstractas.Personas6;
import interfaces.*;

public abstract class Visitante extends Personas6 implements Registrable {
    private String ticketNumber;

    public Visitante(String name, int idNumber, String phone, String email, String gender, String ticketNumber){
        super(name,idNumber,phone,gender,email);
        this.ticketNumber = ticketNumber;
    }

    @Override
    public void showRole() {
        System.out.println("Rol: Visitante");
    }
    public String getId() {
        return "Visitante" + idNumber;
    }

    public void print() {
        System.out.println("=== Visitante ===");
        System.out.println("Nombre: " + name);
        System.out.println("Numero de ticket: " + ticketNumber);
    }

    public void save() {
        System.out.println("Visitante " + name + " guardado correctamente en el sistema.");
    }
}
