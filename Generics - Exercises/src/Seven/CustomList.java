package Seven;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void remove(int index) {
        this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T firstNumber = this.elements.get(firstIndex);
        T secondNumber = this.elements.get(secondIndex);

        this.elements.set(firstIndex, secondNumber);
        this.elements.set(secondIndex, firstNumber);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return this.elements.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return this.elements.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            System.out.println(sb.append(element));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }


}
