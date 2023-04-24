package Java.JavaPractices;

import java.util.Scanner;

public class CalcPower {
    public static void main(String[] args) {
        //declaring variables
        int num, power;
        int result = 1;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting input
        System.out.print("Sayiyi giriniz: ");
        num = sc.nextInt();
        System.out.print("Ussu giriniz: ");
        power = sc.nextInt();

        //power loop
        for (int i = 0; i < power; i++) {
            result *= num; 
        }

        //output
        System.out.println(result);
    }
}
