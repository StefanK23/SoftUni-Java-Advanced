import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;


public class MathPatato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);


        int cycle = 1;

        while (children.size() > 1) {
            for (int pass = 1; pass < n; pass++) {
                String currentChild = children.poll();

                children.offer(currentChild);
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + children.peek());
            } else {
                System.out.println("Removed " + children.poll());
            }

            cycle++;


        }
        System.out.println("Last is " + children.poll());
    }

    private static boolean isPrime(int cycle) {

        if (cycle == 1) {
            return false;
        }
        for (int i = 2; i < cycle; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}
