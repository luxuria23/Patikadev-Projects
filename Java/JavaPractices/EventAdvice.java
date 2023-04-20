package Java.JavaPractices;

import java.util.Scanner;

public class EventAdvice {
    public static void main(String[] args) {
        //declaring variables
        int temp;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin input
        System.out.println("What is temperature?");
        temp = sc.nextInt();

        if (temp < 5) {
            System.out.println("You can go to Ski");
        } else if (temp < 15){
            System.out.println("You can go to Cinema");
        }else if (temp < 25){
            System.out.println("You can go to Picnic");
        }else{
            System.out.println("You can go to Swimming");
        }



        sc.close();
    }
}
