package com.shabbir.Cloudinary.Others.Bank;

import java.util.InputMismatchException;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount)throws Exception{
        if(amount > balance){
            throw new InsufficientFundsException(" Error: Withdrawal amount is greater than the main balance");
        }else if(amount <= 0){
            throw  new InputMismatchException("Error: Withdrawal amount should not be negative or zero");
        }else{
            balance -= amount;
            System.out.println("Transaction successful and");
            System.out.println("The new balance is "+this.balance);
        }
    }
}
