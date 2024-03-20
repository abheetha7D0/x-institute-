package com.bhasha.xInstitute.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, code = HttpStatus.BAD_REQUEST)
public class BadRequest extends RuntimeException {

    public BadRequest() {
        super("The server cannot or will not process the request due to something that is perceived to be a client error");
    }

    public BadRequest(String message) {
        super(message);
    }

}
