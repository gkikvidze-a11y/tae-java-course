package homework7;

import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Beka", 30),
                new Person("Anna", 25),
                new Person("Cita", 22),
                new Person("Gvantsa", 24) // თქვენი მონაცემები
        };

        Arrays.sort(people);

        for (Person p : people) {
            System.out.println(p);
        }
    }
}