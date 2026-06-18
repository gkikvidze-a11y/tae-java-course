package homework9;

import java.util.ArrayList;
import java.util.List;

public class ListUtilities {

    // generic მეთოდი <T> void printList, რომელიც ბეჭდავს ყველა ელემენტს
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // generic მეთოდი <T> T getFirst, რომელიც აბრუნებს პირველ ელემენტს
    public static <T> T getFirst(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        // List<String> ტესტირება
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");

        System.out.print("String List: ");
        printList(strList);
        System.out.println("First String: " + getFirst(strList));

        // List<Integer> ტესტირება
        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);

        System.out.print("Integer List: ");
        printList(intList);
        System.out.println("First Integer: " + getFirst(intList));
    }
}