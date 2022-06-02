import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());;

        TreeSet<String> chemicals = new TreeSet<>();

        for (int i = 0; i < count ; i++) {
            String chemicalsCompound = scanner.nextLine();
            String[] input = chemicalsCompound.split(" ");

            chemicals.addAll(Arrays.asList(input));

        }
        for (String chemical : chemicals) {
            System.out.print(chemical + " ");
        }
    }
}
