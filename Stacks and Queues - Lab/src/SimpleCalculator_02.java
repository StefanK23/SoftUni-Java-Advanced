import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] expressionElements = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i =  expressionElements.length -1; i >= 0 ; i--) {
            stack.push(expressionElements[i]);
        }
        while (stack.size() >1 ){
            int lettOperant = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int rightOperant = Integer.parseInt(stack.pop());

            int result = operator.equals("+") ? lettOperant + rightOperant : lettOperant -rightOperant;

            stack.push(String.valueOf(result));

        }
        System.out.println(stack.pop());
   }
}
