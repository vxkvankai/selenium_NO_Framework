package com.selenium_NO_Framework;

public class PrintReverseStringArray {

    public static void main(String[] args) {

        // Palindrome array
        String t = "";
        String s = "MadaM";
        for (int i = s.length() - 1; i >= 0; i--) {

            t = t + s.charAt(i);

        }
        if (s.equals(t)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not a Palindrome");


    }


}
