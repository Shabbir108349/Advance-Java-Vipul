package com.shabbir.Cloudinary.Others.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            System.out.println("File content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: Problem reading the file.");
        } catch (Exception e) {
            System.out.println("Error: Unexpected error occurred!");
        } finally {
            System.out.println("File operation finished.");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Could not close the file properly.");
            }
            sc.close();
        }
    }
}
