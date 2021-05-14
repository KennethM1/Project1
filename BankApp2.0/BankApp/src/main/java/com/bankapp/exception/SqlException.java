package com.bankapp.exception;

public class SqlException extends Exception{
    SqlException(){

    }
    public SqlException(final String message) {
        super(message);
    }
}
