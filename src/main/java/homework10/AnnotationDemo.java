package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {

    @Author(name = "Gvantsa Kikvidze", date = "2026-06-24")
    public void firstMethod() {
        System.out.println("First method");
    }

    @Author(name = "John Doe")
    public void secondMethod() {
        System.out.println("Second method");
    }

    public static void main(String[] args) {
        Class<AnnotationDemo> obj = AnnotationDemo.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Method: " + method.getName() + " | Author: " + author.name());
            }
        }
    }
}