package com.shabbir.Cloudinary.Others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try {
            int a = sc.nextInt();
            if (a < -1) {
                throw new InputMismatchException("input can not be negative");
            }
//        }catch (Exception e ){
//            System.out.println(e.getMessage());
//        }
    }
}
