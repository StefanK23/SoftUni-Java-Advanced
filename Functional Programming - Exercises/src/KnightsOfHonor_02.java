import java.util.Arrays;
import java.util.Scanner;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String [] names = scanner.nextLine().split("\\s+");
        for (String name : names) {
            System.out.println("Sir " + name);
        }
    }
}
