import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(number);


        Predicate< Integer> checkDivision = numb -> numb % n == 0;
        number.removeIf(checkDivision);


        Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));

          print.accept(number);

    }
}
