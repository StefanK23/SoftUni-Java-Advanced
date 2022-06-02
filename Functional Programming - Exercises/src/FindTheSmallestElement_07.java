import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




                // приемаме списък и печатаме индеска на най-малкото число

                List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

                Consumer<List<Integer>> printMinELement = list -> {


                    int min = Integer.MAX_VALUE;
                    for (Integer number : list) {
                        if(number < min){
                            min = number;
                        }
                    }
                    System.out.println(list.lastIndexOf(min));
                };
                printMinELement.accept(numbers);
            }
        }



