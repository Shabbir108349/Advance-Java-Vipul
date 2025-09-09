package com.shabbir.Cloudinary.Others.Bkash;

public class Account{
    private String name;
    private String phone;
    private double balance;
    public Account(String name,String phone,double balance){
        this.name = name;
        this.phone = phone;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }
    public void cashIn(double amount) throws Exception{
        if(amount <= 0){
            throw new InvalidAmountException("amount can not be a negative");
        }else{
            this.balance += amount;
        }
    }

//    During sending money I will give input of the receiver number, amount.
//    The output will be sending amount, receivers number, date/time, transaction id, current balance
    public void sendMoney(double amount,String receiverNumber)throws Exception{
        if(amount > balance){
            throw new InsufficientFundException("Insufficient funds");
        }else{
            this.balance = balance-amount;
            System.out.println("Fund is transferred to "+ receiverNumber+" and current balance is "+balance);
        }
    }
    public void cashOut(double amount,String receiverNumber)throws Exception{
        if(amount > balance){
            throw new InsufficientFundException("Insufficient funds");
        }else{
            this.balance = balance-amount;
            System.out.println("Fund is Out to "+ receiverNumber+" and current balance is "+balance);
        }
    }
}
