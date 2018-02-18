package com.selenium_NO_Framework;

import java.util.ArrayList;

public class LISTinterfaceARRAYLIST {

    public static void main(String[] args) {

        // arraylist is a dynamic size array. you can add or delete elemnts any time. its not a fixed Array. No need to declare the size.
        //ArrayList, LinkedList, Vector - implementing List Interface *** Can Accept Duplicates
        //        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<String> s = new ArrayList<String>();
        s.add("vamsi");
        s.add("Test");
        System.out.println(s);
        s.add(0, "Student");
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
        s.remove("Test");
        System.out.println(s);
        s.add("New Addition");
        System.out.println(s);
        a.add(5);
        a.add(6);
        System.out.println(a.get(0));
        System.out.println(a.contains(5));

    }


}
