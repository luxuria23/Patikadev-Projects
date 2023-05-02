package Java.JavaPractices;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        for (int num : numbers) {
            sum += 1.0 / num;
        }

        System.out.println(numbers.length/sum);
    }
}
