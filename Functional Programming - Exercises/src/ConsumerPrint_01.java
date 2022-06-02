import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");


        Consumer<String[]> printString = array -> {
            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        };

        printString.accept(names);
    }
}
