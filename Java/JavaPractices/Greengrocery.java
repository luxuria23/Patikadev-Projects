package Java.JavaPractices;

import java.util.Scanner;

public class Greengrocery {
    public static void main(String[] args) {
        //declaring variables
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting kilos
        System.out.print("Armut kaç kilo? :");
        armut *= sc.nextInt();
        System.out.print("Elma kaç kilo? :");
        elma *= sc.nextInt();
        System.out.print("Domates kaç kilo? :");
        domates *= sc.nextInt();
        System.out.print("Muz kaç kilo? :");
        muz *= sc.nextInt();
        System.out.print("Patlıcan kaç kilo? :");
        patlican *= sc.nextInt();

        //output
        System.out.println("Toplam Tutar: " + (armut + elma + domates + muz + patlican));



        sc.close();
    }
}
