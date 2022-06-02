
import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
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


        rowsAndCols = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int secondMatrixRows = rowsAndCols[0];
        int secondMatrixCols = rowsAndCols[1];

        int[][] matrixSecond = new int[secondMatrixRows][secondMatrixCols];

        for (int row = 0; row < secondMatrixRows; row++) {
            int[] arrTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrixSecond[row] = arrTwo;

        }


           if( matricesAreEqual(matrix, matrixSecond)){
               System.out.println("equal");
           }else {
               System.out.println("not equal");
           }



    }

    private static boolean matricesAreEqual(int[][] matrix, int[][] matrixSecond) {

        if (matrix.length != matrixSecond.length) {
            return false;
        }

        for (int row = 0; row < matrix.length; row++) {
            int[]firstArray = matrix[row];
            int[]secondArray = matrixSecond[row];
            
            if(firstArray.length!= secondArray.length){
                return false;
            }
            for (int col = 0; col < firstArray.length; col++) {
                if(firstArray[col]!= secondArray[col]){
                    return false;
                }
            }
        }

        return true;
    }
}



