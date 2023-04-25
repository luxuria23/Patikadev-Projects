package Java.JavaHomeworks;

/**
 * FindPrime
 */
public class FindPrime {

    public static void main(String[] args) {
        //declaring variables
        boolean isPrime = true;
        //loop for [2,100) numbers
        for (int i = 2; i < 100; i++) {
            //checkhing for any divider
            for (int j = 2; j < i; j++) {
                //if divider found 
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            //if divider not found it prints
            if (isPrime) {
                System.out.print(i + " ");
            }
            isPrime = true;
        }
    }
}