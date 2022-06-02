import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
                     phoneBook.put(name,phoneNumber);

            input = scanner.nextLine();
        }
        String name = scanner.nextLine();

        while (!name.equals("stop")){

            if(phoneBook.containsKey(name)){
                System.out.printf("%s -> %s%n",name, phoneBook.get(name));
            }else {
                System.out.printf("Contact %s does not exist.%n", name);
            }

            name = scanner.nextLine();
        }
    }
}
