package Java.JavaHomeworks;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //declaring variables
        int num, sum;
        sum = 0;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin num
        System.out.print("Give num: ");
        num = sc.nextInt();

        //sum of all multipliers
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        //checkin is it perfect number
        if (sum == num) {
            System.out.println("its perfect number");
        }else{
            System.out.println("it isnt perfect number");
        }


        sc.close();
    }
}
