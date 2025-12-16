package com.JardinBotanico.excepciones;

public class InvalidPlantException extends Exception {

    public InvalidPlantException(String message) {
        super(message);
    }

    public InvalidPlantException(String message, Throwable cause) {
        super(message, cause);
    }
}

