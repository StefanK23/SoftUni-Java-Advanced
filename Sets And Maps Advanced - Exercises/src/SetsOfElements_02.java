import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);


        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>(n);
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>(m);


        for (int i = 0; i < n; i++) {
             int number = Integer.parseInt(scanner.nextLine());
             firstSet.add(number);
        }
        for (int i = 0; i < m ; i++) {
            int numberTwo = Integer.parseInt(scanner.nextLine());
            secondSet.add(numberTwo);

        }
        firstSet.retainAll(secondSet);

        for (Integer integer : firstSet) {
            System.out.print(integer + " ");
        }
    }
}