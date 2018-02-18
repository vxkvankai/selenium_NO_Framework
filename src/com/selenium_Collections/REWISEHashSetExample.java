package com.selenium_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class REWISEHashSetExample {

    public static void main(String[] args) {
        // HashSet Treeset, LinkedHashSet implements Set Interface.
        // does not accept dupllicate values
        // There is no guaranee that elements stored in sequential order. it stores in Random order

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("Honkong");
        hs.add("Japan");
        //System.out.println(hs);


        //        System.out.println(hs);
        //        System.out.println(hs.size());
        Iterator<String> i = hs.iterator();
        //i.next();
        System.out.println(hs.size());

        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }

}
