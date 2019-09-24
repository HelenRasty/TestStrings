package com.globallogic.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        String myStr3 = "Using methods of class String";

        System.out.println("-------------------------- TASK #1: 5.a --------------------------");
        System.out.println("The index of first “a” substring of myStr is: " + myStr.indexOf('a'));

        System.out.println("-------------------------- TASK #1: 5.b --------------------------");
        System.out.println("The index of last “b” substring of myStr is: " + myStr.lastIndexOf('b'));

        System.out.println("-------------------------- TASK #1: 5.c --------------------------");
        System.out.println("The substring of myStr from 3 to 6 char index is: " + myStr.substring(3, 7));

        System.out.println("-------------------------- TASK #1: 6, 7 -------------------------");
        System.out.println("Reverted string is: " + reverseString(myStr));

        System.out.println("-------------------------- TASK #2 -------------------------------");
        System.out.println("All of the letters, which are present in the first word, but absent in the second are: "
                + lettersFromFirstString(myStr1, myStr2));

        System.out.println("-------------------------- TASK #3 -------------------------------");
        char[] unChars = uniqueChars(myStr3);
        System.out.println("Array of unique chars of the given string is: ");
        for (int i = 0; i < unChars.length; i++) {
            if (i == unChars.length - 1) {
                System.out.print(unChars[i]);
            } else {
                System.out.print(unChars[i] + ", ");
            }
        }

    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int index = str.length() - 1;

        for (int i = index; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static String lettersFromFirstString(String string1, String string2) {
        StringBuilder sb = new StringBuilder(string1.length());

        for (int i = 0; i < string1.length(); i++) {

            if (string2.toLowerCase().indexOf(string1.toLowerCase().charAt(i)) == -1) {
                sb.append(string1.charAt(i));
            }
        }
        return sb.toString();
    }

    private static char[] uniqueChars(String s) {
        char[] chars = new char[s.length()];
        int j = 0;
        char current;

        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (s.indexOf(current) == s.lastIndexOf(current)) {
                chars[j] = current;
                j++;
            }
        }
        char[] unChars = Arrays.copyOf(chars, j);
        return unChars;
    }
}
