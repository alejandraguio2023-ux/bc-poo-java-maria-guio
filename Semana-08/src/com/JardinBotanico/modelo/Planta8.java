package com.JardinBotanico.modelo;

/**
 * Representa una planta dentro del Jardín Botánico
 */
public class Planta8 {

    private String codigo;
    private String nombreComun;
    private String nombreCientifico;
    private String origen;

    public Planta8(String codigo, String nombreComun, String nombreCientifico, String origen) {
        this.codigo = codigo;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.origen = origen;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Planta8{" +
                "codigo='" + codigo + '\'' +
                ", nombreComun='" + nombreComun + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}

