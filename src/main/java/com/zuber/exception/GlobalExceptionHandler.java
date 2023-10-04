package com.zuber.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(MotoristaNaoEncontrado.class)
        public ResponseEntity<Object> handleMotoristaNaoEncontrado(MotoristaNaoEncontrado ex) {
            Map<String, Object> body = new LinkedHashMap<>();
            body.put("mensagem", ex.getMessage());

            return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
        }
    }
