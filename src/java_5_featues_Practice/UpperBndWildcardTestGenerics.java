package java_5_featues_Practice;

import java.util.Arrays;
import java.util.List;


public class UpperBndWildcardTestGenerics {

    public static void main(String[] args) {

        // upperbound integer list
        List<Integer> intList = Arrays.asList(100, 200, 3000);
        System.out.println("Totla sum is:" + sum(intList));
        // double list
        List<Double> doubleList = Arrays.asList(6.1, 3.4, 9.2);

        System.out.println("Totla sum is:" + sum(doubleList));



    }

    public static double sum(List<? extends Number> List) {

        double sum = 0.0;
        for (Number i : List) {
            sum += i.doubleValue();

        }
        return sum;
    }

}
