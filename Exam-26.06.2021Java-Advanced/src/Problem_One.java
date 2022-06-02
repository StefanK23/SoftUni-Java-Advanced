import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ПРОЧИТАМЕ STACK ОТ КОНЗОЛАТА
        //!!!КОГАТО ИЗПОЛЗВАМ STACK ТРЯБВА ИЗРИЧНО ДА МУ КАЖА,ЧЕ ЩЕ ИЗПОЛЗВАМ PUSH МЕТОДА
        ArrayDeque<Integer> tasksStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                //всеки един елемент ще бъде прекаран през на secondBox push-метода
                .forEach(tasksStack::push);

        //ПРОЧИТАМЕ QUEUE ОТ КОНЗОЛАТА
        //Този метод използва ADD -> ADD РАБОТИ КАТО QUEUE ОПАШКА
        ArrayDeque<Integer> threadsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                //всеки един елемент ще бъде прекаран през на secondBox push-метода
                .forEach(threadsQueue::offer);

//        System.out.println(tasksStack.pop());
//        System.out.println(threadsQueue.poll());

        int taskToKill = Integer.parseInt(scanner.nextLine());

        while (!threadsQueue.isEmpty() && !tasksStack.isEmpty()) {
            int task = tasksStack.peek();
            int thread = threadsQueue.peek();

            if (task != taskToKill) {
                if (thread >= task) {
                    threadsQueue.poll();
                    tasksStack.pop();
                } else {
                    threadsQueue.poll();
                }
            } else {
                System.out.printf("Thread with value %d killed task %d%n", thread, taskToKill);
                break;
            }
        }

        System.out.println(threadsQueue.stream().map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
