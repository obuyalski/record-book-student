package com.company;
// поменять порядок слов в строках на обратный

import java.io.IOException;
import java.util.Scanner;

import static com.company.InputReverse.inputFile;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String FILENAME = "input.txt";
        inputFile (FILENAME);
    }
}
