package com.shabbir.Cloudinary.Others.Bkash;

public class Test {
    public static void main(String[] args) {
        Account a = new Account("shabbir","01312354955",500);
        try {
            a.cashIn(100);
            a.sendMoney(200,"0174866595");
            a.cashOut(100,"389374374");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
