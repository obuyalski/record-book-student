package com.company;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Олег on 20.09.2016.
 */
public class InputFile {
    String[] string;

    public String[] inputFile(int numberRows) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
        String line;
        String b;
        int i = 0;
        StringTokenizer st;
        string = new String[numberRows];
        while ((line = br.readLine()) != null && i != numberRows) {
            st = new StringTokenizer(line, "\n\r");
            while (st.hasMoreTokens() && i != numberRows) {
                string[i++] = (st.nextToken());
            }
        }
        return string;
    }

}