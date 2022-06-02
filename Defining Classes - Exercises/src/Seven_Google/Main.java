package Seven_Google;

import First.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, person> personData = new HashMap<>();


        String input = scanner.nextLine();


        while (!input.equals("End")) {

            String[] parameters = input.split("\\s+");
            String name = parameters[0];
            String enterData = parameters[1];
            if(!personData.containsKey(name)){
                personData.put(name, new person());

            }

            switch (enterData) {
                case "company":
                    String companyName = parameters[2];
                    String department = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Company company = new Company(companyName, department, salary);
                    personData.get(name).setCompany(company);

                    break;
                case "pokemon":
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personData.get(name).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = parameters[2];
                    String parentBirthDay = parameters[3];
                    Parent parent = new Parent(parentName, parentBirthDay);
                    personData.get(name).getParents().add(parent);
                    break;
                case "children":
                    String childName = parameters[2];
                    String childBirthDay = parameters[3];
                    Child child = new Child(childName, childBirthDay);
                    personData.get(name).getChildren().add(child);
                    break;
                case "car":
                    String carModel = parameters[2];
                    int carSpeed = Integer.parseInt(parameters[3]);
                    Car car = new Car(carModel, carSpeed);
                    personData.get(name).setCar(car);

                    break;
            }


            input = scanner.nextLine();
        }
        String searchedPerson = scanner.nextLine();
        System.out.println(searchedPerson);

        person personalData = personData.get(searchedPerson);
        System.out.println(personalData);
    }

}
