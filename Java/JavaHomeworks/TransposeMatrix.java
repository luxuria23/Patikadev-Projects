package Java.JavaHomeworks;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};

        matrix = transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] newMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
