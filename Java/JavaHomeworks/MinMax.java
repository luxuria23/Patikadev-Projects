package Java.JavaHomeworks;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //declaring variables
        int min, max, temp, num;
        min = 0;
        max = 0;
        

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin how many num
        System.out.println("How many nums?");
        num = sc.nextInt();

        //loop
        for (int i = 0; i < num; i++) {
            //getting numbers
            System.out.println("Give " + (i + 1) + "nth Number: ");
            temp = sc.nextInt();

            //checkhin min max
            if(min == 0 || max == 0){
                min = temp;
                max = temp;
            }else{
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }
        }

        //output
        System.out.println("Biggest num: " + max + " and smallest num: " + min);

        sc.close();
    }
}
