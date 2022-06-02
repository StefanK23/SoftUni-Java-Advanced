import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String text = scanner.nextLine();
        TreeMap<Character,Integer> symbols = new TreeMap<>();


        for (int i = 0; i <= text.length() -1 ; i++) {
            char chars = text.charAt(i);

            if(!symbols.containsKey(chars)){
                symbols.put(chars, 1);
            }else {
                int currentCount = symbols.get(chars);
                symbols.put(chars,currentCount +1 );

            }

        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
