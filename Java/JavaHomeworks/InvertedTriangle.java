package Java.JavaHomeworks;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        //declaring variables
        int length;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin input
        System.out.print("give length: ");
        length = sc.nextInt();

        //outer loop
        for (int i = length; i > 0 ; i--) {
            //space loop
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }

            //star loop
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}