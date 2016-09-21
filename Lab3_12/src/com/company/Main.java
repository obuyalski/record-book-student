package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.ReverseString.reverseStrings;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String FILENAME = "input.txt";
        System.out.println("Enter the numbers of rows.");
        int numberRows = 0;
        try {
            numberRows = scanner.nextInt();
            InputFile iFile = new InputFile();
            reverseStrings(numberRows, iFile.inputFile(numberRows, FILENAME));
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }


    }
}
