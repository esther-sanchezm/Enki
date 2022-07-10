package com.enki.common.exception;


public class EntityNoExistException extends RuntimeException {

    static final String messageException = "No exist boardGameClass %s with %s : %s";

    public EntityNoExistException(String nameClass, String param, String value) {
        super(String.format(messageException, nameClass, param, value));
    }
}
