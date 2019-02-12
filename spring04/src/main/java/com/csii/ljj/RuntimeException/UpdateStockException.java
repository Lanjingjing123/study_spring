package com.csii.ljj.RuntimeException;

public class UpdateStockException extends RuntimeException {

    private static final long serialVersionUID = 1035162426161151588L;

    public UpdateStockException() {
        super();
    }

    public UpdateStockException(String message) {
        super(message);
    }

    public UpdateStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateStockException(Throwable cause) {
        super(cause);
    }

    protected UpdateStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
