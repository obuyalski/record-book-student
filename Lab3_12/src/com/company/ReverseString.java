package com.company;

/**
 * Created by Олег on 17.09.2016.
 */
public class ReverseString {
    public void reverseStrings(int numberRows, String[] strings) {
        String str = new String();
        for (int j = 0; j < numberRows; j++)
            System.out.println(str = new StringBuffer(strings[j]).reverse().toString());
    }
}
