package com.shabbir.Cloudinary.Others.Bank;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
