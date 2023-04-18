package com.knoldus.SpringwebApp.CustomException;

public class EmployeeNotFound extends RuntimeException {

    public EmployeeNotFound(String message) {
        super(message);
    }
}
