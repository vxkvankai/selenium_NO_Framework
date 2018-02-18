package com.selenium_NO_Framework;

public class ArraysFindMinunInRowandFindMaxInThatColumn {



    //        array {2, 4, 5},
    //        {3, 0, 7},
    //        {1, 2, 9}};
    //        
    //        1. FInd the minimum number
    //        2.Identify the colum of the min number
    //        3. find the max num in that column
    //        4. Print the max number from that column
    //        
    //        You can also get more exposure about Apache POI API with selenium from below link
    //        http://www.guru99.com/all-about-excel-in-selenium-poi-jxl.htmlpackage coreJava;


    /*
     * 2 4 5
     * 
     * 3 4 7
     * 
     * 1 2 9
     */
    //Maximum number from the array

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int abc[][] = {{1, 4, 7}, {3, 2, 6}, {1, 2, 9}};
        int min = abc[0][0];
        int mincoloumn = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min)//2
                {
                    min = abc[i][j];
                    mincoloumn = j;
                }
            }
        }
        //=1
        int max = abc[0][mincoloumn];
        int k = 0;
        while (k < 3) {
            if (abc[k][mincoloumn] > max) {
                max = abc[k][mincoloumn];
            }
            k++;
        }

        System.out.println(max);
    }

}
