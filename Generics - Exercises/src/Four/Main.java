package Four;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SwapBoxIntegers<Integer> box = new SwapBoxIntegers<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int text = Integer.parseInt(scanner.nextLine());
            box.add(text);
        }
        String indexes = scanner.nextLine();
        int swapIndex1 = Integer.parseInt(indexes.split("\\s+")[0]);
        int swapIndex2 = Integer.parseInt(indexes.split("\\s+")[1]);

        box.swap(swapIndex1,swapIndex2);
        System.out.println(box);
    }
    }

