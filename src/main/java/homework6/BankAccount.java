package homework6;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("არასაკმარისი ბალანსი!");
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("გვანცა", 100);
        acc.deposit(50);
        System.out.println("მიმდინარე ბალანსი: " + acc.getBalance());

        acc.withdraw(200);
    }
}