package homework9;

import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Gvantsa");
        names.add("Anna");
        names.add("Beka");
        names.add("Eka");
        names.add("George");

        System.out.println("Size: " + names.size());
        System.out.println("First: " + names.get(0));
        System.out.println("Last: " + names.get(names.size() - 1));

        names.remove(2);


        System.out.println("Contains Anna? " + names.contains("Anna"));


        System.out.println("All names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}