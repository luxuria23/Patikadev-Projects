package Java.JavaPractices;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting x y z
        System.out.print("x= ");
        int x = sc.nextInt();
        System.out.print("y= ");
        int y = sc.nextInt();
        System.out.print("z= ");
        int z = sc.nextInt();

        //calculations
        double u = (x + y + z) / 2.0;
        double area = Math.sqrt(u * (u-x) * (u-y) * (u-z));

        //printing result
        System.out.println("Area of given triangle is " + area);


        sc.close();
    }
}
