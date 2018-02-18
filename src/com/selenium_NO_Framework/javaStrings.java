package com.selenium_NO_Framework;

public class javaStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "test";
        String str = new String("tetln $jlhlh");
        str.charAt(8);
        System.out.println(str.charAt(8));
        System.out.println(str.indexOf("$"));
        System.out.println(str.substring(8));

        /// reverse string
        String s1 = "madam";

        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.println(s1.charAt(i));
        }

    }

}
