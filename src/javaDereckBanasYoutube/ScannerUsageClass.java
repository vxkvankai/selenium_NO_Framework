package javaDereckBanasYoutube;

import java.util.Scanner;

public class ScannerUsageClass {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //DereckBanasYoutube: https://www.youtube.com/watch?v=yYN8u90MKCg&list=PLE7E8B7F4856C9B19&index=2

        System.out.print("Enter Number: ");

        if (userInput.hasNext()) {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered: " + numberEntered);
        } else
            System.out.println("Enter an iteger next time");


    }
}
