package homework7;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title) {
        this(title, "Unknown", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Book("Java"));
        System.out.println(new Book("Java", "Bloch"));
        System.out.println(new Book("Java", "Bloch", 2020));
    }
}