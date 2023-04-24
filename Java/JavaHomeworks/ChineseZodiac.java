package Java.JavaHomeworks;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        //declaring variables
        int year;
        String response;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting inputs
        System.out.print("Dogum yilinizi giriniz: ");
        year = sc.nextInt();

        response = "Hata";
        switch (year % 12) {
            case 0:
                response = "Maymun";
                break;
            case 1:
                response = "Horoz";
                break;
            case 2:
                response = "Kopek";
                break;
            case 3:
                response = "Domuz";
                break;
            case 4:
                response = "Fare";
                break;
            case 5:
                response = "Okuz";
                break;
            case 6:
                response = "Kaplan";
                break;
            case 7:
                response = "Tavsan";
                break;
            case 8:
                response = "Ejderha";
                break;
            case 9:
                response = "Yilan";
                break;
            case 10:
                response = "At";
                break;
            case 11:
                response = "Koyun";
                break;
        }


        //output
        System.out.println(" Cin Zodyagi Burcunuz: " + response);


        sc.close();
    }
}
