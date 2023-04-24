package Java.JavaPractices;

import java.util.Scanner;

/**
 * FindEven
 */
public class FindEven {

    public static void main(String[] args) {
        //declaring variables
        int num;
        int sum = 0;
        int count = 0;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting inputs
        System.out.print("Sayi Giriniz: ");
        num = sc.nextInt();

        //calc sum
        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                sum += i;
                count++;
            }
        }

        //output
        System.out.println("3 ve 4'e bolunen sayilarin ortalamasi: " + (sum / (double)count));
    
        sc.close();
    }
}