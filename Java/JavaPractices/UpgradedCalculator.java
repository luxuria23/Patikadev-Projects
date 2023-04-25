package Java.JavaPractices;

import java.util.Scanner;

public class UpgradedCalculator {

    static void plus() {
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
    }

    static void minus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = sc.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = sc.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void divided() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = sc.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    static void mode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int num = sc.nextInt();
        System.out.print("Mod giriniz: ");
        int mode = sc.nextInt();
        System.out.println(num + "'un " + mode + "'a gore modu " + (num % mode) + "'dur");
    }

    static void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kenar uzunlugu: ");
        int edge1 = sc.nextInt();
        System.out.print("Kenar uzunlugu: ");
        int edge2 = sc.nextInt();
        System.out.println("Dikdortegenin alani: " + (edge1 * edge2) + " cevresi: " + 2 * (edge1 + edge2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- cikarma Islemi\n"
                + "3- carpma Islemi\n"
                + "4- Bolme islemi\n"
                + "5- UslU Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("LUtfen bir islem seciniz :");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}