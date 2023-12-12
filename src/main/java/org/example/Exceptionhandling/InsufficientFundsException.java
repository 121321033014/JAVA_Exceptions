package org.example.Exceptionhandling;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException (String message) {
        super(message);
    }
}
