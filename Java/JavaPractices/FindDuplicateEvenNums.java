package Java.JavaPractices;

public class FindDuplicateEvenNums {
    public static void main(String[] args) {
        int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 7, 8, 9, 2, 2, 6};
        int[] duplicates = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j && numbers[i] == numbers[j]){
                    if (!isInclude(duplicates, numbers[i])) {
                        duplicates[count++] = numbers[i];
                    }
                }
            }
        }
        for (int i : duplicates) {
            if(i != 0){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isInclude(int[] arr, int val){
        for (int i : arr) {
            if(i == val) return true;
        }
        return false;
    }
}
