package Java.JavaHomeworks;

public class FrequencyFinder {
    public static void main(String[] args) {
        // find every element frequency
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };

        // solution
        int[][] freq = new int[arr.length][2];

        int indexCount = 0;
        for (int i = 0; i < freq.length; i++) {
            boolean isFound = false;
            int freqCount = 0;
            for (int j = 0; j < freq.length; j++) {
                if (arr[i] == arr[j]) {
                    freqCount++;
                }
                if (arr[i] == freq[j][0]) {
                    isFound = true;
                } 
            }
            if(!isFound){
                freq[indexCount][0] = arr[i];
                freq[indexCount++][1] = freqCount; 
            }
        }
        System.out.println("Tekrar Sayilari");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][0] != 0) {
                System.out.println(freq[i][0] + " sayisi " + freq[i][1]  + " kere tekrar etti");
            }
        }

    }
}
