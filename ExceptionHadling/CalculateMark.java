package com.shabbir.Cloudinary.Others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = 0;
        double total = 0.0;

        try {
            System.out.print("Enter number of students: ");
            numberOfStudents = sc.nextInt();

            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.print("Enter mark for student " + i + ": ");
                int mark = sc.nextInt();

                // Check valid range
                if (mark < 0 || mark > 100) {
                    throw new InvalidMarkException("Invalid mark! Must be between 0 and 100.");
                }

                total += mark;
            }

            double average = total / numberOfStudents;
            System.out.println("Average marks: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only!");
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Marks input completed.");
            sc.close();
        }
    }
}
