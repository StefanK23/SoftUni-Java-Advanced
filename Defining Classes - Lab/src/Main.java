import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           int n = Integer.parseInt(scanner.nextLine());;

           while(n-- > 0) {

               String[] tokens = scanner.nextLine().split(" ");

               Car_01 car = new Car_01();


               car.setBrand(tokens[0]);
               car.setModel(tokens[1]);
               car.setHorsePower(Integer.parseInt(tokens[2]));

               System.out.println(car.toString());
           }
       // System.out.printf("The car is: %s %s - %d HP",car.getBrand(), car.getModel(), car.getHorsePower());
    }
}
