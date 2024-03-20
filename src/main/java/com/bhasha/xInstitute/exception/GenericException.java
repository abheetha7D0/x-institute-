package com.bhasha.xInstitute.exception;


import com.bhasha.xInstitute.enums.ErrorCode;

public class GenericException extends ApiException {
    private final ErrorCode errorCode;

    public GenericException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public GenericException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public GenericException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public GenericException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    @Override
    public ErrorCode errorCode() {
        return errorCode;
    }

    @Override
    public int httpStatus() {
        return 500;
    }
}
