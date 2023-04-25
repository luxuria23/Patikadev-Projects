package Java.JavaHomeworks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // declaring variables
        int num1, num2, sum, length;
        num1 = 0;
        num2 = 1;
        sum = 0;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // gettin length
        System.out.print("Give length: ");
        length = sc.nextInt();

        //checkin valid input
        if (length < 1) {
            System.out.println("error length must be positive");
        } else {
            //if input is valid starts fibonacci loop
            for (int i = 0; i < length; i++) {
             System.out.print(num1 + " ");
             sum = num1 + num2;
             num1 = num2;
             num2 = sum;
            }
        }
        sc.close();
    }
}
