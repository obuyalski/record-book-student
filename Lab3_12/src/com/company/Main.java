package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of rows.");
        int numberRows = 0;
        try {
            numberRows = scanner.nextInt();
            InputFile iFile = new InputFile();
            iFile.inputFile(numberRows);
            ReverseString reverse = new ReverseString();
            reverse.reverseStrings(numberRows, iFile.inputFile(numberRows));
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }


    }
}
