package Java.JavaPractices;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        //declaring variables
        int n, r, result;
        int nFact = 1;
        int rFact = 1;
        int nrFact = 1;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //gettin input
        System.out.print("Kombinasyon için n: ");
        n = sc.nextInt();
        System.out.print("Kombinasyon için r: ");
        r = sc.nextInt();

        //n factoriel
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        //r factoriel
        for (int j = 1; j <= r; j++) {
            rFact *= j;
        }
        
        //n-r factoriel
        for (int k = 1; k <= (n-r); k++) {
            nrFact *= k;
        }

        //calc result
        result = nFact / (rFact * nrFact);


        //output
        System.out.println(result);


        sc.close();
    }
}
