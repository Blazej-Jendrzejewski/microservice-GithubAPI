package com.example.microservicegithubapi.service;

import com.example.microservicegithubapi.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ErrorResponse> handleHttpClientErrorException(HttpClientErrorException e) {
        String githubErrorMessage = e.getMessage();
        ErrorResponse error = new ErrorResponse(e.getStatusCode().value(), githubErrorMessage);
        return new ResponseEntity<>(error, e.getStatusCode());
    }


}
