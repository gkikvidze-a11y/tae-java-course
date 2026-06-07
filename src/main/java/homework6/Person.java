package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // გეთერები
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("გამარჯობა, მე ვარ " + name + ", " + age + " წლის.");
    }

    public static void main(String[] args) {

        Person person1 = new Person("გვანცა", 37, "gvantsa@example.com");
        person1.introduce();


        Person person2 = new Person("ანა", 25, "ana@example.com");
        person2.introduce();
    }
}