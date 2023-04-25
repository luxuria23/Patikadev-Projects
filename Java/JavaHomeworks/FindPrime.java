package Java.JavaHomeworks;

/**
 * FindPrime
 */
public class FindPrime {

    public static void main(String[] args) {
        //declaring variables
        boolean isPrime = true;
        //loop
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(i + " ");
            }
            isPrime = true;
        }
    }
}