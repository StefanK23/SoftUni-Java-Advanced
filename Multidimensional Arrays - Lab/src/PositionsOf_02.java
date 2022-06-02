import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int firstMatrixRows = rowsAndCols[0];
        int firstMatrixCols = rowsAndCols[1];

        int[][] matrix = new int[firstMatrixRows][firstMatrixCols];

        for (int row = 0; row < firstMatrixRows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            matrix[row] = arr;
        }

        int searchedNumber  = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == searchedNumber ){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }

    }
}
