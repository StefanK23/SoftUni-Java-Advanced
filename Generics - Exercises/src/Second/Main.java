package Second;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BoxOfInteger<Integer> box = new BoxOfInteger<>();

        while(n-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        System.out.println(box);
    }
}
