package Pointers.SameDirectionPointer;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        // Aapka bataya hua Fast & Slow Pointer format
        int slow = 0;
        int fast = 0;
        int n = arr.length;

        while (fast < n) {
            // Agar fast pointer wala element slow pointer wale element se different hai
            // (Iska matlab hume ek naya unique element mil gaya)
            if (arr[fast] != arr[slow]) {
                slow++;             // Slow pointer ko naye spot par le jao
                arr[slow] = arr[fast]; // Naye unique element ko wahan write kar do
            }
            fast++; // Fast pointer hamesha aage badhta rahega scan karne ke liye
        }

        // Return the number of unique elements (length is index + 1)
        return slow + 1;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {1, 1, 2, 2, 3};

        // Processing
        int uniqueCount = removeDuplicates(arr);

        // Output Format jaisa aapne maanga (Sirf unique part print karne ke liye)
        System.out.print("[");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i]);
            if (i < uniqueCount - 1) System.out.print(",");
        }
        System.out.println("]");
        // Output: [1,2,3]
    }
}
