package Java.JavaPractices;

import java.util.Scanner;

/**
 * CircleSlice
 */
public class CircleSlice {
    public static void main(String[] args) {
            //declaring variables
            double pi = 3.14;
            int r, angle;
            double slice;

            //scanner object
            Scanner sc = new Scanner(System.in);

            //getting r of circle
            System.out.print("r:");
            r = sc.nextInt();

            //getting angle
            System.out.print("angle:");
            angle = sc.nextInt();

            //area of slice
            slice = (pi * r * r * angle) / 360;

            //output
            System.out.println("area of slice: " + slice);

 
            sc.close();
    }
}