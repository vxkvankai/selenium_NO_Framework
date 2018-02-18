package com.selenium_NO_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class REVIEWhasMapExample {

    // 
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // **** HashMap and HashTable are similar but HashMap is non-synchronized, not thread safe. Allows Null values. Use Iterator.
        // **** HashTable is thread safe and synchronized. No nulls. no iterator. need to use Enumerator

        hm.put(0, "Hello");
        hm.put(41, "Good");
        hm.put(3, "Best");
        System.out.println(hm);

        Set sn = hm.entrySet();
        Iterator it = sn.iterator();

        //HashTable  - Pass table set collections

        while (it.hasNext()) {

            Map.Entry mp = (Map.Entry) it.next(); // iterator is cast into map
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());

        }
    }

}
