package com.company;

/**
 * Created by Олег on 17.09.2016.
 */
public class ReverseString {
    public static void reverseStrings(int numberRows, String[] strings) {
        for (int j = 0; j < numberRows; j++)
            System.out.println(new StringBuffer(strings[j]).reverse().toString());
    }
}
