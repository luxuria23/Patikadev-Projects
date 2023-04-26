package Java.JavaHomeworks;

import java.util.Scanner;


public class PrimeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    static boolean isPrime(int num){
        if(num <= 1) return false;
        else return isPrime(num, 2);
    }

    static boolean isPrime(int num, int divisor){
        if (num > divisor) {
            if (num % divisor == 0) {
                return false;
            } else {
                return isPrime(num, ++divisor);
            }
        } else {
            return true;
        }
    }
}
