package com.bhasha.xInstitute.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, code = HttpStatus.NOT_FOUND)
public class NotFound extends RuntimeException {

    public NotFound() {
        super("The server can not find the requested resource");
    }

    public NotFound(String message) {
        super(message);
    }

}
