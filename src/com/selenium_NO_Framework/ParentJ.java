package com.selenium_NO_Framework;

public class ParentJ {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("I started learning java");
        // add 2 numbers
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        ChildMethod m = new ChildMethod();
        System.out.println(m.ValidateHeader());

    }

}
