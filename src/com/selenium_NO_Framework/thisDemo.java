package com.selenium_NO_Framework;

public class thisDemo {
    int a = 2;

    public void getData() {
        int a = 3;
        int b = a + this.a; // adding local and this 
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
    }


    public static void main(String[] args) {

        thisDemo td = new thisDemo();
        td.getData();
    }

}
