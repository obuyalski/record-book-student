package com.company;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Олег on 20.09.2016.
 */
public class InputReverse {
    public static void inputFile( String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String string = new String ();
        String line = "";
        String b = "";
        StringTokenizer st;
        while ((line = br.readLine()) != null ) {
            st = new StringTokenizer(line, "\n\r");
            while (st.hasMoreTokens()) {
                string = new String(st.nextToken());
                b = new StringBuffer(string).reverse().toString();
                System.out.println(b);
            }
        }
    }
}
