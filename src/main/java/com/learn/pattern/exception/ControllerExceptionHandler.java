package com.learn.pattern.exception;

import com.learn.pattern.model.ApiError;
import com.learn.pattern.model.ControllerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(InvalidAssetTypeException.class)
    public ResponseEntity<ControllerResponse> invalidAssetType(InvalidAssetTypeException exception){
        var response = ControllerResponse.builder()
                .error(ApiError.builder()
                        .statusCode(400)
                        .reason(exception.getMessage())
                        .dateTime(LocalDateTime.now())
                        .build())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InputIdException.class)
    public ResponseEntity<ControllerResponse> invalidId(InputIdException e){
        var response = ControllerResponse.builder()
                .error(ApiError.builder()
                        .statusCode(400)
                        .reason(e.getMessage())
                        .dateTime(LocalDateTime.now())
                        .build())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
