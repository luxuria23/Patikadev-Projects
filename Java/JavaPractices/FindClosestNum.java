package Java.JavaPractices;

import java.util.Scanner;

public class FindClosestNum {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int num, small, big;
        small = list[0];
        big = list[0];

        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        num = sc.nextInt();

        for (int i : list) {
            if (i > num) {
                if ( Math.abs(i - num) < Math.abs(num - big) ) {
                    big = i;
                }
            } else {
                if ( Math.abs(i - num) < Math.abs(num - small) ) {
                    small = i;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + small);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + big);

        sc.close();
    }
}
