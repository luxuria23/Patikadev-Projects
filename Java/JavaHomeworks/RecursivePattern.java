package Java.JavaHomeworks;

import java.util.Scanner;

/**
 * RecursivePattern
 */
public class RecursivePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        pattern(num);
    }

    static void pattern(int num) {
        System.out.print(num + " ");
        if(num <= 0){
            return;
        }
        pattern(num - 5);
        System.out.print(num + " ");
    }

    
}