package org.bigwillc.demo.exception;

/**
 * Custom exception.
 *
 * @author bigwillc
 **/
public class CustomException extends RuntimeException {

    private String message;

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
        this.message = message;
    }
}
