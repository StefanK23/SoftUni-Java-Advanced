package First;

import First.Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        jar.add(69);
        jar.add(44);
        jar.add(23);

        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}
