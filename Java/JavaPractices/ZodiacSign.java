package Java.JavaPractices;

import java.util.Scanner;

/**
 * ZodiacSign
 */
public class ZodiacSign {

    public static void main(String[] args) {
        // declaring variables
        int month, day;
        String response;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting month and day
        System.out.print("month: ");
        month = sc.nextInt();
        System.out.print("day: ");
        day = sc.nextInt();

        //logic
        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19))
            response = "Oglak";
        else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17))
            response = "Kova";
        else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19))
        response = "Balik";
        else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19))
            response = "koç";
        else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20))
        response = "Boga";
        else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20))
        response = "Ikizler";
        else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22))
        response = "Yengec";
        else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22))
        response = "Aslan";
        else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22))
        response = "Basak";
        else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
        response = "Terazi";
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
        response = "Akrep";
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
        response = "Yay";
        else response = "hesaplanamadi. Yanlis tarih girdiniz";

        //print
        System.out.println("Burcunuz " + response);
        
        sc.close();
    }
}