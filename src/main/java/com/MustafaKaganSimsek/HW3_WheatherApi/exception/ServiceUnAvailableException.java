package com.MustafaKaganSimsek.HW3_WheatherApi.exception;

public class ServiceUnAvailableException extends RuntimeException {
    public ServiceUnAvailableException(String message) {
        super(message);
    }
}
