package com.learn.pattern.exception;

public class InvalidAssetTypeException extends RuntimeException{
    public InvalidAssetTypeException(String message){
       super(message);
    }
}
