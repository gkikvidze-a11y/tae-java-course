
package homework9;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // მეთოდი findPhone, რომელიც აბრუნებს ნომერს ან "არ მოიძებნა"
    public static String findPhone(HashMap<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) { // [cite: 34]
            return phoneBook.get(name);
        }
        return "არ მოიძებნა";
    }

    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();

        // დაამატე 4 ჩანაწერი (ერთი შენი)
        book.put("Gvantsa", "555-123456");
        book.put("Anna", "555-987654");
        book.put("Beka", "555-456789");
        book.put("Eka", "555-321654");

        // 2 ცდა main()-ში (ერთი ნამდვილი, ერთი არასწორი)
        System.out.println("Search 'Gvantsa': " + findPhone(book, "Gvantsa"));
        System.out.println("Search 'John': " + findPhone(book, "John"));

        System.out.println("\nAll contacts (Keys + Values):");
        // for-each keySet-ით ყველა keys+values დაბეჭდვა
        for (String key : book.keySet()) {
            System.out.println(key + " -> " + book.get(key));
        }
    }
}