package com.JardinBotanico.excepciones;

public class CareScheduleException extends Exception {

    public CareScheduleException(String message) {
        super(message);
    }

    public CareScheduleException(String message, Throwable cause) {
        super(message, cause);
    }
}

