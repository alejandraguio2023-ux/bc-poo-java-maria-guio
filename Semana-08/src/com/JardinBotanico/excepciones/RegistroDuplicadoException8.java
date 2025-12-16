package com.JardinBotanico.excepciones;

/**
 * Excepción lanzada cuando se intenta registrar
 * una visita con un código duplicado.
 */
public class RegistroDuplicadoException8 extends Exception {

    public RegistroDuplicadoException8(String mensaje) {
        super(mensaje);
    }

    public RegistroDuplicadoException8(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
