package com.JardinBotanico.modelo;

import java.time.LocalDate;

/**
 * Representa un registro de visita en el Jardín Botánico
 */
public class RegistroVisita8 {

    private String codigo; // clave única
    private Visitante8 visitante;
    private Planta8 planta;
    private LocalDate fecha;
    private String tipoVisita;

    public RegistroVisita8(String codigo, Visitante8 visitante,
                           Planta8 planta, LocalDate fecha, String tipoVisita) {
        this.codigo = codigo;
        this.visitante = visitante;
        this.planta = planta;
        this.fecha = fecha;
        this.tipoVisita = tipoVisita;
    }

    public String getCodigo() {
        return codigo;
    }

    public Visitante8 getVisitante() {
        return visitante;
    }

    public Planta8 getPlanta() {
        return planta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    @Override
    public String toString() {
        return "RegistroVisita8{" +
                "codigo='" + codigo + '\'' +
                ", visitante=" + visitante.getNombre() +
                ", planta=" + planta.getNombreComun() +
                ", fecha=" + fecha +
                ", tipoVisita='" + tipoVisita + '\'' +
                '}';
    }
}

