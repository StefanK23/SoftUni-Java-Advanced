import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (firstNumber, secondNumber) -> {
            if(firstNumber % 2 == 0 && secondNumber % 2 != 0){
                return 1;
            }else if( Math.abs(firstNumber) % 2 != 0 && Math.abs(secondNumber) % 2 == 0) {
                return  -1 ;

            }else if((firstNumber % 2 ==0 && secondNumber % 2 == 0) || (firstNumber% 2 == 1 && secondNumber%2 == 1  )){
                if(firstNumber <= secondNumber) {
                    return 1;
                }else{
                    return -1;
                }


            }
            return 0;

        };






                numbers.sort(comparator);
                numbers.forEach(e -> System.out.print(e + " "));
    }
}
