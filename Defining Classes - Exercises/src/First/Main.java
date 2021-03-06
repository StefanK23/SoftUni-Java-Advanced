package First;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();


        for (int i = 1; i <= n ; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            Person person = new Person (name,age);

            if(age > 30){
                people.add(person);
            }
        }

        //spisuk s horata nad 30god.
        people.sort(Comparator.comparing(p -> p.getName())) ;

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());

        }

    }
}
