package com.areopelican;
public class InsufficinetBalanceException extends Exception {
    public InsufficinetBalanceException(String message) {
        super(message);
    }
}