package Pointers.OppositeDirectionPointer;

public class ReverseStringVariant {
    public static String reverseString(String s) {
        // String ko char array mein convert kiya taaki swap kar sakein
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        // Wapas String banakar return kar diya
        return new String(arr);
    }

    public static void main(String[] args) {
        // Input Format
        String s = "hello";

        // Output Process
        String result = reverseString(s);
        System.out.println(result); // Output: olleh
    }
}
