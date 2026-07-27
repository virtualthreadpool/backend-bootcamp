package com.aeropelican.productservice.exception;

import com.aeropelican.productservice.dto.response.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse<Object>> handleResourceNotFoundException(
            ResourceNotFoundException ex) {

        APIResponse<Object> response = APIResponse.builder()
                .success(false)
                .message(ex.getMessage())
                .data(null)
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIResponse<Object>> handleException(Exception ex) {

        APIResponse<Object> response = APIResponse.builder()
                .success(false)
                .message(ex.getMessage())
                .data(null)
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}