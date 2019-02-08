package com.tekion.query.db_query.Exception;


public class IllegalArgumentException extends Exception {
  String message;

    public IllegalArgumentException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message +"Exception Occurred";
    }
}
