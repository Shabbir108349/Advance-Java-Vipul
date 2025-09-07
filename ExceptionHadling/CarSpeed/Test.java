package com.shabbir.Cloudinary.Others.CarSpeed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max speed limit: ");
        try {
            int speedLimit = sc.nextInt();
            if(speedLimit <= 0){
                throw new NegativeSpeedException("Error: Speed can not be negative or zero");
            }
            System.out.print("Enter Current speed: ");
            int currentSpeed = sc.nextInt();
            if(currentSpeed <= 0){
                throw new NegativeSpeedException("Error: Speed can not be negative or zero");
            }
            if(currentSpeed > speedLimit){
                throw new OverSpeedException("Error: Car is over speeding! ");
            }
            if(currentSpeed < speedLimit){
                System.out.println("car is running safely at "+currentSpeed+" km/h");
            }
        }catch (InputMismatchException | OverSpeedException | NegativeSpeedException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Speed check completed.");
        }
    }
}
