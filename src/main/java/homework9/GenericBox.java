package homework9;

// Generic კლასი Box<T>
class Box<T> {
    private T value;

    // კონსტრუქტორი
    public Box(T value) {
        this.value = value;
    }

    // გეთერი
    public T get() {
        return value;
    }

    // სეთერი
    public void set(T value) {
        this.value = value;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        // 3 ტიპი: Box<String>, Box<Integer>, Box<Double>
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        // შედეგების დაბეჭდვა
        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + integerBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}