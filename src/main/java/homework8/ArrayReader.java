package homework8;

public class ArrayReader {
    public static int readSafe(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ინდექსი არასწორი: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        System.out.println("სწორი ინდექსი: " + readSafe(nums, 1));
        System.out.println("არასწორი ინდექსი: " + readSafe(nums, 10));
    }
}