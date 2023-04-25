package Java.JavaPractices;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //declaring variables
        int num;
        int sum = 0;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting input
        System.out.print("Give number: ");
        num = sc.nextInt();

        //sum of digits
        while (num / 10 != 0) {
            sum += num % 10;
            num /= 10;
        }
        //add last digit cause loop dont add last
        //when checkin condition its come to last digit
        //any digit/10 equals 0 so exits loop
        sum += num;
    

        //output
        System.out.println("sum of digits " + sum);

        //scanner close
        sc.close();
    }
}
