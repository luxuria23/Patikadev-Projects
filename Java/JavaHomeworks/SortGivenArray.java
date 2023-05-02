package Java.JavaHomeworks;

import java.util.Arrays;
import java.util.Scanner;

public class SortGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print( (i + 1) + ". Elemanı giriniz: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i + 1); j++) {
                if(numbers[j] < numbers[j - 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j -1];
                    numbers[j -1] = temp;
                }    
            }
        }

        System.out.println(Arrays.toString(numbers));


        sc.close();
    } 
}
