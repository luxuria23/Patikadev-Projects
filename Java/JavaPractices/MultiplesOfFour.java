package Java.JavaPractices;

import java.util.Scanner;

public class MultiplesOfFour {
    public static void main(String[] args) {
        //declaring variables
        int sum = 0;
        int num;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //loop
        do {
            System.out.print("Sayi Giriniz: ");
            num = sc.nextInt();
            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);

        //output
        System.out.println("Toplam : " + sum);

        sc.close();
    }
}
