package homework6;

public class Counter {
    int count = 0;
    int maxValue = 10;

    public void increment() {
        if (count < maxValue) {
            count++;
        }
    }

    public void reset() {
        count = 0;
    }

    public void countTo(int target) {
        for (int i = 1; i <= target; i++) {
            increment();
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.maxValue = 10;
        c.countTo(5);
        System.out.println(c.count);
    }
}