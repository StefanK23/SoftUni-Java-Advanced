import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];
        fillMatrix(scanner, matrix, rows, cols);


        String command = scanner.nextLine();
        while (!command.equals("END")) {

            if (!validateCommand(command, rows, cols)) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            } else {
                String[] tokens = command.split(" ");
                int rowFirst = Integer.parseInt(tokens[1]);
                int colFirst = Integer.parseInt(tokens[2]);
                int rowSecond = Integer.parseInt(tokens[3]);
                int colSecond = Integer.parseInt(tokens[4]);

                String element1 = matrix[rowFirst][colFirst];
                String element2 = matrix[rowSecond][colSecond];

                matrix[rowFirst][colFirst] = element2;
                matrix[rowSecond][colSecond] = element1;
                printMatrix(matrix, rows, cols);
            }


            command = scanner.nextLine();
        }


    }

    private static boolean validateCommand(String command, int rows, int cols) {
        String[] tokens = command.split("\\s+");
        String commandName = tokens[0];
        if (!commandName.equals("swap")) {
            return false;
        }
        if (tokens.length != 5) {
            return false;
        }
        int rowFirst = Integer.parseInt(tokens[1]);
        int colFirst = Integer.parseInt(tokens[2]);
        int rowSecond = Integer.parseInt(tokens[3]);
        int colSecond = Integer.parseInt(tokens[4]);

        if (rowFirst < 0 || rowFirst >= rows || colFirst < 0 || colFirst >= cols ||
                rowSecond < 0 || rowSecond >= rows || colSecond < 0 || colSecond >= cols) {
            return false;
        }
        return true;
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
