package homework7;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.print("Employee: " + name + ", Salary: ");
    }
}