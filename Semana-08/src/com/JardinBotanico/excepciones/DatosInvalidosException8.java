package com.JardinBotanico.excepciones;

/**
 * Excepción lanzada cuando los datos proporcionados
 * para el registro de visita no son válidos.
 */
public class DatosInvalidosException8 extends Exception {

    public DatosInvalidosException8(String mensaje) {
        super(mensaje);
    }

    public DatosInvalidosException8(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
