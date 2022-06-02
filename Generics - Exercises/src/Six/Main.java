package Six;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoxSix<Double> box = new BoxSix<>();
        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0){
           Double text = Double.parseDouble(scanner.nextLine());
            box.add(text);
        }
        Double element = Double.parseDouble(scanner.nextLine());

        System.out.println(box.countGreaterThan(element));
    }
    }

