package com.selenium_NO_Framework;

public class MultiDimensionArrays {

    public static void main(String[] args) {

        int a[][] = new int[2][3];
        //            {3, 5, 6},
        //            {2, 5, 4},
        //            {1, 4, 3}};
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;

        //                System.out.println(a[1][0]);
        //         System.out.println(a[1][1]);

        for (int i = 0; i < 2; i++) {
            //System.out.println(a[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }

    }
}


