package Seven_Google;

import First.Person;

import java.util.ArrayList;
import java.util.List;

public class person {
    // 1 company
    // 1 car
    // many parents, child and pokemon

    private Company company;
    private Car car;

    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;

    public person() {
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
        this.children = new ArrayList<>();


    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company.toString()).append("\n");
        }
        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car.toString()).append("\n");
        }

        builder.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            builder.append(pokemon.toString()).append("\n");
        }
        builder.append("Parents:").append("\n");
        for (Parent parent : parents) {
            builder.append(parent.toString()).append("\n");
        }

        builder.append("Children:").append("\n");
        for (Child child : children) {
            builder.append(child.toString()).append("\n");
        }

        return builder.toString();

    }
}

