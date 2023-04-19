package Java.JavaPractices;

import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        //scanner object
        Scanner sc = new Scanner(System.in);

        //price input
        System.out.println("Fiyat Giriniz");
        int price = sc.nextInt();

        //outputs
        System.out.println(
            "Kdv'siz fiyat: " + price +
            "\nKdv'li fiyat: " + price * 1.18 + 
            "\nKdv tutari " + price * 0.18
        );
    }
}
