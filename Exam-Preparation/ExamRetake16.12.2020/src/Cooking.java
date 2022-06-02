import java.util.*;

public class Cooking {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] liquids = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
            int[] ingredients = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

            ArrayDeque<Integer> liquidQueue = new ArrayDeque<>();
            for (int i: liquids) {
                liquidQueue.offer(i);
            }

            ArrayDeque<Integer> ingredientStack = new ArrayDeque<>();
            for (int i :ingredients) {
                ingredientStack.push(i);
            }

            Map<String, Integer> foodMap = new TreeMap<>();
            foodMap.put("Bread", 0);
            foodMap.put("Cake", 0);
            foodMap.put("Pastry", 0);
            foodMap.put("Fruit Pie", 0);

            while (!liquidQueue.isEmpty() && !ingredientStack.isEmpty()) {
                int firstLiquid = liquidQueue.poll();
                int lastIngredient = ingredientStack.pop();
                int sum = firstLiquid + lastIngredient;

                String food = "";
                int count = 0;

                switch (sum) {
                    case 25: //Bread
                        food = "Bread";
                        count = foodMap.get(food);
                        foodMap.put(food, count + 1);
                        break;

                    case 50: //Cake
                        food = "Cake";
                        count = foodMap.get(food);
                        foodMap.put(food, count + 1);
                        break;

                    case 75: //Pastry
                        food = "Pastry";
                        count = foodMap.get(food);
                        foodMap.put(food, count + 1);
                        break;

                    case 100: //Fruit Pie
                        food = "Fruit Pie";
                        count = foodMap.get(food);
                        foodMap.put(food, count + 1);
                        break;

                    default:
                        lastIngredient += 3;
                        ingredientStack.push(lastIngredient);
                        break;
                }
            }

            if (foodMap.containsValue(0)){
                System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
            } else {
                System.out.println("Wohoo! You succeeded in cooking all the food!");
            }

            System.out.println("Liquids left: " + getLeftovers(liquidQueue));

            System.out.println("Ingredients left: " + getLeftovers(ingredientStack));

            foodMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
        }

        private static String getLeftovers(ArrayDeque<Integer> list) {
            if (list.isEmpty()) {
                return "none";
            }
            return String.join(", ", String.valueOf(list)
                    .replaceAll("[\\[\\]]", ""));
        }
}
