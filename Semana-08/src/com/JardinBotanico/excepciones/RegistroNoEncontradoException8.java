package com.JardinBotanico.excepciones;

/**
 * Excepción lanzada cuando no se encuentra
 * un registro de visita solicitado.
 */
public class RegistroNoEncontradoException8 extends Exception {

    public RegistroNoEncontradoException8(String mensaje) {
        super(mensaje);
    }

    public RegistroNoEncontradoException8(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
