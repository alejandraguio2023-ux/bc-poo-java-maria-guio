package abstractas;

public abstract class Personas6 {
    protected String name;
    protected int idNumber;
    protected String phone;
    protected String gender;
    protected String email;

    public Personas6(String name, int idNumber, String phone, String gender, String email) {
        this.name = name;
        this.idNumber = idNumber;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Nombre completo" + name);
        System.out.println("Nombre completo" + idNumber);
        System.out.println("Nombre completo" + phone);
        System.out.println("Nombre completo" + gender);
        System.out.println("Nombre completo" + email);
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public abstract void showRole();
}
