package com.bhasha.xInstitute.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, code = HttpStatus.UNAUTHORIZED, reason = "The client must authenticate itself to get the requested response")
public class Unauthorized extends RuntimeException {

    public Unauthorized() {
        super();
    }

}
