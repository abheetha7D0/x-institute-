package com.bhasha.xInstitute.exception;


import com.bhasha.xInstitute.enums.ErrorCode;

public abstract class ApiException extends RuntimeException {
    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public abstract ErrorCode errorCode();

    public String errorMessage() {
        return getMessage();
    }

    public abstract int httpStatus();
}
