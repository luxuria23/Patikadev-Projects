package Java.JavaPractices;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        //declaring variables
        int num1, num2, ekok, ebob, counter;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin nums
        System.out.print("Num1: ");
        num1 = sc.nextInt();
        System.out.print("Num2: ");
        num2 = sc.nextInt();

        //sorting nums
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        //ebob
        counter = num2;
        while(true){
            if (num1 % counter == 0 && num2 % counter == 0) {
                ebob = counter;
                break;
            }else{
                counter--;
            }
        }

        //ekok
        counter = num1;
        while(true){
            if (counter % num1 == 0 && counter % num2 == 0) {
                ekok = counter;
                break;
            }else{
                counter++;
            }
        }

        //output
        System.out.println("Ekok: " + ekok + " Ebob: " + ebob);

        sc.close();
    }
}
