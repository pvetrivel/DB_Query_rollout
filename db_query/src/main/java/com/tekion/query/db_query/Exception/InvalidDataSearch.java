package com.tekion.query.db_query.Exception;

public class InvalidDataSearch extends Exception {
    String message;
    public InvalidDataSearch(String message) {
        this.message=message;
    }
    public String toString(){
        return (message+" Exception Occurred") ;
    }
}
