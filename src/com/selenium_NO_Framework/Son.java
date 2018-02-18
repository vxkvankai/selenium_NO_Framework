package com.selenium_NO_Framework;

public class Son extends GrandFatherClass {
    public static void main(String[] args) {
        GrandFatherClass s = new GrandFatherClass();
        s.city();
        s.country();
        System.out.println(s.i);
    }

    public void activities() {
        System.out.println("activities");
    }



}
