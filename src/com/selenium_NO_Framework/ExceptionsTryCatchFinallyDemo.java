package com.selenium_NO_Framework;

public class ExceptionsTryCatchFinallyDemo {

    // *** ONE try can be folloded by multiple catch blocks

    public static void main(String[] args) {
        //        ExceptionsDemo ed = new ExceptionsDemo();
        //        ed.getData();

        int b = 7;
        int c = 0;

        try {
            //int k = b / c;
            //System.out.println(k);
            int arr[] = new int[5];
            System.out.println(arr[7]);

        } catch (ArithmeticException et) {
            System.out.println("we caught ARITHMETIC exception");
        }

        catch (ArrayIndexOutOfBoundsException ab) {
            System.out.println("we caught ArrayOutOfBoundsException");

        } catch (IndexOutOfBoundsException ets) {
            System.out.println("we caught IndexOutOfBoundsException");

        } catch (Exception e) // *** catches generic exceptions
        {
            System.out.println("we caught exception");
        } finally
        // **** Finally goes with Try and this block is executed irrespective of the exception thrown or not
        // **** finally can go with try alone without the catches but the script fails and the code in the finally will be executed
        // ** finally can only be stopped by forcing jvm execution by clicking the red button.
        {
            System.out.println("Delte cookies or Execute some code here");
        }


    }
}
