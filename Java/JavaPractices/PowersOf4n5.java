package Java.JavaPractices;

import java.util.Scanner;

/**
 * PowersOf4n5
 */
public class PowersOf4n5 {

    public static void main(String[] args) {
        //declaring variables
        int num;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting input
        System.out.print("Sayi Giriniz: ");
        num = sc. nextInt();

        for (int i = 1; i <= num; i *= 4) {
            System.out.println(i);
        }
        
        for (int j = 1; j <= num; j *= 5) {
            System.out.println(j);
        }
    }
}