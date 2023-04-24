package Java.JavaPractices;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        // declaring variables
        int a, b, c;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting variables
        System.out.print("num1: ");
        a = sc.nextInt();
        System.out.print("num2: ");
        b = sc.nextInt();
        System.out.print("num3: ");
        c = sc.nextInt();

        if (a > c){
            int tmp = a;
            a = c;
            c = tmp;
        }

        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (b > c){
            int tmp = b;
            b = c;
            c= tmp;
        }

        System.out.println(a + " " + b + " " + c);
        sc.close();
    }
}
