package homework7;

public class FullTime extends Employee {
    private double monthlySalary;

    public FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}