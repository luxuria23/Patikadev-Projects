package Java.JavaHomeworks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // declarin variables
        int year;
        boolean isLeap;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting inputs
        System.out.print("Yil Giriniz: ");
        year = sc.nextInt();

        if (year % 4 != 0) {
            isLeap = false;
        } else if ((year % 100 == 0) && !(year % 400 == 0)) {
            isLeap = false;
        } else {
            isLeap = true;
        }

        // output
        if (isLeap) {
            System.out.println(year + " bir artik yildir!");
        } else {
            System.out.println(year + " bir artik yil degildir!");
        }

        sc.close();
    }
}
