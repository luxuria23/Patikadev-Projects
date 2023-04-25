package Java.JavaPractices;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        //declaring variables
        int num;

        //scanner object
        Scanner sc  = new Scanner(System.in);

        //gettin inputs
        System.out.print("Length of triange: ");
        num = sc.nextInt();

        for (int i = 1; i <= num * 2; i++) {
            if (i <= num) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i - num; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=  2 * (2*num - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }




        sc.close();
    }
}
