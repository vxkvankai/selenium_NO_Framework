package com.selenium_NO_Framework;

public class ConstructorDemo {

    // Constructor is like a method but it does not return any values and name is same as the class
    // Constructor is a block of code executed when an object of the class is created

    // explicit default type
    public ConstructorDemo() {

        System.out.println("I am in the constructor");
    }

    //Parameterized Constructor

    public ConstructorDemo(int a, int b) {

        System.out.println("Ima in the parameterized constructor");
    }


    public ConstructorDemo(String s) {

        System.out.println(s);
    }

    public void getData() {
        System.out.println("I am a method");
    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo("hello");
        // ConstructorDemo d = new ConstructorDemo(4, 5);


        // default Constructor is called implicit construct and it is called if you do not declare an explicit Constructor.

    }

}
