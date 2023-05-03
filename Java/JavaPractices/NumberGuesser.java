package Java.JavaPractices;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        startGame(5);
    }



    static void startGame(int points){
        
        Random ran = new Random();
        int num = ran.nextInt(100);
        gameLoop(num,points);
    }

    static void gameLoop(int num, int points){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess number");
        int guess = sc.nextInt();
        if (guess < 0 || guess > 100) {
            System.out.println("invalid input");
            gameLoop(num, points);
        }else if (points > 0) {
            if (guess == num) {
                System.out.println("Its right. You win!");
                return;
            }else if (guess < num){
                System.out.println("You close but number is bigger than you thought. You have " + points + " try left");
                points--;
                gameLoop(num, points);
            }else{
                System.out.println("You close but number is smaller than you thought. You have " + points + " try left");
                points--;
                gameLoop(num,points);
            }
        }else{
            System.out.println("You lose! Number is " + num);
        }
    }
}
