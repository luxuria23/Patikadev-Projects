package Java.JavaHomeworks;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        // getting variables
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
        System.out.print("power: ");
        int pow = sc.nextInt();

        System.out.println(pow(num, pow));
        sc.close();
    }

    static int pow(int num, int pow){
        if(pow <= 0) return 1;
        else return num * pow(num, pow - 1);
    }
}
