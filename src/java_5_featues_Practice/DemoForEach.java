package java_5_featues_Practice;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

    public static void main(String[] args) {


        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);

        // External loops: For loops
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        System.out.println("********");
        System.out.println("********");

        // External loops: "Enhanced for" loops

        for (int i : values) {
            System.out.println(i);
        }


        System.out.println("********");
        System.out.println("********");


        // internal loops - java 8 // Lambda expression
        values.forEach(i -> System.out.println(i));


    }

}
