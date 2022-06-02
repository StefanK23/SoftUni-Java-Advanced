package Seven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CustomList<String> list = new CustomList<>();

        String[] tokens = scanner.nextLine().split("\\s+");


        while (!tokens[0].equals("END")) {

            switch (tokens[0]) {
                case "Add":
                    list.add(tokens[1]);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(tokens[1]);
                    list.remove(removeIndex);
                    break;
                case "Contains":
                    String containsElement = tokens[1];
                    System.out.println(list.contains(containsElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    list.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    String greaterElement = tokens[1];
                    System.out.println(list.countGreaterThan(greaterElement));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;

            }
            tokens[0] = scanner.nextLine();
        }
    }
}
