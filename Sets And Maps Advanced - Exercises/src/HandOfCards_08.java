import java.util.*;

public class HandOfCards_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Set<String>> playersCards = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String[] inputCards = input.split(": ")[1].split(", ");

            Set<String> cards = new HashSet<>();
            Collections.addAll(cards, inputCards);

            if (!playersCards.containsKey(name)) {
                playersCards.put(name, cards);
            } else {
                Set<String> currentCards = playersCards.get(name);
                currentCards.addAll(cards);
                playersCards.put(name, currentCards);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> player : playersCards.entrySet()) {
            int point = getCardPoints(player.getValue());
            System.out.println(player.getKey() + ": " + point);

        }
    }

    private static int getCardPoints(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> pointValues = getPointValues();
        for (String card : cards) {
            int points;
            if (card.contains("10")) {
                char strength = card.charAt(2);
                points = 10 * pointValues.get(strength);


            }else   {



            char number = card.charAt(0);
            char strength = card.charAt(1);
                    points =pointValues.get(strength) * pointValues.get(number);
        }
            sum+= points;
        }
        return sum  ;
    }

    private static Map<Character, Integer> getPointValues() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);
        return  points;
    }
}
