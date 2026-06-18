package homework9;

import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // შექმენი HashSet და ჩაამატე ყველა ელემენტი
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // დაბეჭდე უნიკალურები და მათი რაოდენობა
        System.out.println("Unique: " + uniqueSet);
        System.out.println("Size: " + uniqueSet.size());

        // შეამოწმე contains(3) და contains(10)
        System.out.println("Contains 3? " + uniqueSet.contains(3));
        System.out.println("Contains 10? " + uniqueSet.contains(10));
    }
}