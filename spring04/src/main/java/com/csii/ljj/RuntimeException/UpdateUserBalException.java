package com.csii.ljj.RuntimeException;

public class UpdateUserBalException extends RuntimeException {
    private static final long serialVersionUID = -5001478978034365143L;

    public UpdateUserBalException() {
        super();
    }

    public UpdateUserBalException(String message) {
        super(message);
    }

    public UpdateUserBalException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateUserBalException(Throwable cause) {
        super(cause);
    }

    protected UpdateUserBalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
