import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int firstMatrixRows = rowsAndCols[0];
        int firstMatrixCols = rowsAndCols[1];

        int[][] matrix = new int[firstMatrixRows][firstMatrixCols];

        for (int row = 0; row < firstMatrixRows; row++) {
            String[] arr = scanner.nextLine().split(", ");
            for (int col = 0; col < arr.length ; col++) {
                matrix[row][col] =Integer.parseInt(arr[col]);
            }
        }
        System.out.println(firstMatrixRows);
        System.out.println(firstMatrixCols);
        System.out.println(getElementSum(matrix));
    }

    private static int getElementSum(int[][] matrix) {
        int sum =0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum+= matrix[row][col];
            }
        }

        return sum;
    }
}
