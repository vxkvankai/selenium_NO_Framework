package com.selenium_Collections;

import java.util.ArrayList;

public class CollectionsDemo {

    public static void main(String[] args) {

        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        // ***** Print number of occurrences of each number and also the Unique number in the array by using ArrayList<Integer>


        ArrayList<Integer> ab = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;

            if (!ab.contains(a[i])) {
                ab.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }


                }

                System.out.println("Number " + a[i] + " Occured " + k + " Times ");

                if (k == 1)
                    System.out.println("Number " + a[i] + " is Unique number");
            }

        }



    }

}
