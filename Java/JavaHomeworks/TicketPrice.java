package Java.JavaHomeworks;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        // declaring variables
        int distance, age, typeOfTicket;
        double price, discountedPrice;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting variables
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = sc.nextInt();
        System.out.print("Yasinizi giriniz: ");
        age = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz giriniz (1 => Tek Yön , 2 => Gidis Donus): ");
        typeOfTicket = sc.nextInt();

        // checking inputs
        if (distance < 0 || age < 0 || !(typeOfTicket > 0 && typeOfTicket < 3)) {
            System.out.println("Hatali Veri Girdiniz!");
            sc.close();
            return;
        }

        // calc price
        price = (int) (distance * 0.10);

        //age discounts
        if (age <= 12) {
            discountedPrice = price * 0.50;
        }else if (age <= 24){
            discountedPrice = price * 0.90;
        }else if (age < 65){
            discountedPrice = price;
        }else{
            discountedPrice = price * 0.70;
        }

        //ticket type discounts
        if(typeOfTicket == 2){
            discountedPrice = 2 * (discountedPrice * 0.80); 
        }

        //output
        System.out.println("Toplam Tutar = " + discountedPrice);




        sc.close();
    }
}
