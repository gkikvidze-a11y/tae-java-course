package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Rex");
        animals[1] = new Cat("Mia");
        animals[2] = new Dog("Buddy");
        animals[3] = new Cat("Whiskers");

        for (Animal animal : animals) {
            String type = "";
            if (animal instanceof Dog) {
                type = "Dog";
            } else if (animal instanceof Cat) {
                type = "Cat";
            }

            System.out.print(animal.name + " (" + type + "): ");
            animal.makeSound();
            animal.sleep();
        }
    }
}