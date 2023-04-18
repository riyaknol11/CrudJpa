package com.knoldus.SpringwebApp.CustomException;

import java.io.Serial;

public class BusinessException extends RuntimeException {

    private String errorCode;
    @Serial
    private static final long serialVersionUID = 1l;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public BusinessException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public static long getSerialVersionUID(){
        return serialVersionUID;
    }

    public BusinessException() {

    }
}
