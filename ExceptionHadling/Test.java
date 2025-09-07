package com.shabbir.Cloudinary.Others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Enter the Number of the students ");
        Scanner sc = new Scanner(System.in);
        int noOfStudents;
        int totalMark = 0;
        int single;
        try{
            noOfStudents = sc.nextInt();
            if(noOfStudents <= 0){
                throw new InputMismatchException("No of student can not be zero");
            }
            for(int i=1; i<=noOfStudents; i++){
                System.out.println("Enter number of student "+i +" :");
                single = sc.nextInt();
                if(single < 0 || single > 100){
                    throw new InvalidMarkException("marks should be on 1 to 100");
                }
                totalMark += single;
            }
            System.out.println("The average number is "+totalMark/noOfStudents);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }catch (InvalidMarkException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Marks input completed.");
        }



    }
}
