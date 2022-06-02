import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> SecondPlayer = new LinkedHashSet<>();

        int[] cardsOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cardsTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int numbers : cardsOne) {
            firstPlayer.add(numbers);
        }
        for (int number : cardsTwo) {
            SecondPlayer.add(number);
        }

        for (int i = 0; i < 50; i++) {
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = SecondPlayer.iterator().next();
            SecondPlayer.remove(secondNumber);

            if(firstNumber > secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);

            }else if(firstNumber< secondNumber){
                SecondPlayer.add(firstNumber);
                SecondPlayer.add(secondNumber);
            }
        }







        if(firstPlayer.size() > SecondPlayer.size()){
            System.out.println("First player win!");
        }else if(firstPlayer.size() < SecondPlayer.size()) {
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
}
}