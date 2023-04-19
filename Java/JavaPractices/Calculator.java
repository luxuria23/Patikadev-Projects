package Java.JavaPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // declaring variables
        int number1, number2, select, result;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting numbers
        System.out.print("Ilk Sayiyi Giriniz: ");
        number1 = sc.nextInt();
        System.out.print("ikinci Sayiyi Giriniz: ");
        number2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        select = sc.nextInt();

        // switch case
        switch (select) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("Bir sayi sifira bolunemez");
                    result = 0;
                }else{
                    result = number1 / number2;
                }
                break;
            default:
                result = 0;
                System.out.println("Hatali secim");
        }

        // output
        System.out.println("Result: " + result);

        sc.close();
    }
}
