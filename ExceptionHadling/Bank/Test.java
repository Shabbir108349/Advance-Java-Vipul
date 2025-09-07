package com.shabbir.Cloudinary.Others.Bank;

public class Test {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        try {
            b.withdraw(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Transaction finished");
        }
    }
}
