package org.example.http;

import lombok.Getter;

@Getter
public class HttpParsingException extends Exception {
    private HttpStatusCode errorCode;

    public HttpParsingException(HttpStatusCode errorCode) {
        super(errorCode.MESSAGE);
        this.errorCode = errorCode;
    }
}
