package com.selenium_NO_Framework;

public class MultiDimArrayMinValue {

    public static void main(String[] args) {

        /////


        //
        //        int abc[][] = {{2, 4, 5}, 
        //                        {3, 1, 7},
        //                        {1, 2, 9}};
        //    
        //        int min = abc[0][0];
        //        for (int i = 0; i < 3; i++) { // rows
        //            //System.out.println(a[i]);
        //            for (int j = 0; j < 3; j++) { // columns
        //
        //                if (abc[i][j] < min) {
        //                    min = abc[i][j];
        //                }
        //
        //            }
        //
        //        }
        //        System.out.println(max);
        //    }
        //        
        ////

        int abc[][] = {
            {2, 4, 5},
            {3, 1, 7},
            {1, 2, 9}};

        int max = abc[0][0];
        for (int i = 0; i < 3; i++) { // rows
            //System.out.println(a[i]);
            for (int j = 0; j < 3; j++) { // columns

                if (abc[i][j] > max) {
                    max = abc[i][j];
                }

            }

        }
        System.out.println(max);
    }

}
