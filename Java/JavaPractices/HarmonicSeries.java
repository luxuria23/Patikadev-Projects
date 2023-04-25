package Java.JavaPractices;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        //declaring variables
        int num;
        double result = 0;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin input
        System.out.print("Give n: ");
        num = sc.nextInt();

        //loop
        for (double i = 1; i <= num; i++) {
            result += 1/i;
        }

        //output
        System.out.println(result);

        //scanner close
        sc.close();
    }
}
