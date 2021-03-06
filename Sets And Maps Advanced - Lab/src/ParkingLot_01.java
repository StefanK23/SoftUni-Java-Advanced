
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> cars = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String car = input.split("\\s+")[1];
            if(input.contains("IN")){
            cars.add(car);
            }else {
                cars.remove(car);
            }
            input= scanner. nextLine();
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            System.out.println(String.join(System.lineSeparator(),cars));
        }
    }
}
