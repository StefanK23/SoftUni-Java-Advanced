import java.util.*;
import java.util.stream.Collectors;

public class problem_1_Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tulips = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .forEach(tulips::push); // четем от конзолата стек


        ArrayDeque<Integer> daffodils = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> others = new ArrayList<>();

        int count = 0;

        while (!tulips.isEmpty() && !daffodils.isEmpty()) {

            int firstItem = tulips.pop();
            int secondItem = daffodils.poll();

            int sum = firstItem + secondItem;

            if (sum == 15) {
                count++;

            } else if (sum > 15) {
                for (int i = firstItem -2 ; i >= 0; i--) {
                    sum = i + secondItem;
                    if (sum == 15) {
                        count++;
                        break;
                    } else if (sum < 15) {
                        others.add(sum);
                        break;
                    }
                }

            } else {
                others.add(sum);

            }





        }
        int otherSum = 0 ;
        for (Integer other : others) {
            otherSum+= other;
        }
        int bucket = otherSum / 15;
        int wantedBuckets = bucket + count;
        int left = 5;

        if (count >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", count);
        } else {
            System.out.printf("You failed... You need more %d bouquets.",left - wantedBuckets);
        }


    }


}
