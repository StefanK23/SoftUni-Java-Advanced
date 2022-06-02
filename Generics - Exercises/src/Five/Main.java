package Five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoxFive<String> box = new BoxFive<>();
        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0){
            String text = scanner.nextLine();
            box.add(text);
        }
        String element = scanner.nextLine();

        System.out.println(box.countGreaterThan(element));
    }
}
