package com.shabbir.Cloudinary.Others.CarSpeed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int s = sc.nextInt();
            System.out.println(s);

        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }
}
