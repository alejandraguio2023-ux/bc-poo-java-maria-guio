package com.JardinBotanico.modelo;

/**
 * Representa un visitante del Jardín Botánico
 */
public class Visitante8 {

    private String id;
    private String nombre;
    private String email;

    public Visitante8(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Visitante8{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

