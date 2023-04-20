package Java.JavaPractices;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //declaring variables
        int math, physics, turkish, chem, music;
        double sum = 0;
        int count = 0;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //getting input
        System.out.println("Mathematic grade");
        math = sc.nextInt();
        if (math > 0 && math < 100) {
            sum += math;
            count++;
        }
        System.out.println("Physics grade");
        physics = sc.nextInt();
        if (physics > 0 && physics < 100) {
            sum += physics;
            count++;
        }
        System.out.println("Turkish grade");
        turkish = sc.nextInt();
        if (turkish > 0 && turkish < 100) {
            sum += turkish;
            count++;
        }
        System.out.println("Chemistry grade");
        chem = sc.nextInt();
        if (chem > 0 && chem < 100) {
            sum += chem;
            count++;
        }
        System.out.println("Music grade");
        music = sc.nextInt();
        if (music > 0 && music < 100) {
            sum += music;
            count++;
        }
        
        //calculating average
        double average = sum / count;

        //output
        if (average > 55) {
            System.out.println("You passed your grade is: " + average);
        }else{
            System.out.println("You failed your grade is: " + average);
        }

        sc.close();
    }
}
