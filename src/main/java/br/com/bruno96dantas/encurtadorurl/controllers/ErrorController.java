package br.com.bruno96dantas.encurtadorurl.controllers;

import br.com.bruno96dantas.encurtadorurl.exceptions.ShortUrlException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ShortUrlException.class)
    public ResponseEntity shortUrlExceptionHandler(ShortUrlException e) {
        return ResponseEntity.status(404)
                .contentType(MediaType.APPLICATION_JSON)
                .body(e.getMessage());
    }
}
