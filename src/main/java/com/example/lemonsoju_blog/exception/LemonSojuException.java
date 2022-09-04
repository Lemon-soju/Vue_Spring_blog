package com.example.lemonsoju_blog.exception;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class LemonSojuException extends RuntimeException {

    public final Map<String, String> validation = new HashMap<>();

    public LemonSojuException(String message) {
        super(message);
    }

    public LemonSojuException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract int getStatusCode();

    public void addValidation(String fieldName, String message) {
        validation.put(fieldName, message);
    }
}
