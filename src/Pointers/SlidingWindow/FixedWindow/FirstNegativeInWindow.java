package Pointers.SlidingWindow.FixedWindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {
    public static int[] firstNegativeNumber(int[] arr, int k) {
        int n = arr.length;
        // Total windows kitni banengi: n - k + 1
        int[] result = new int[n - k + 1];
        int resultIndex = 0;

        // Negative numbers ke indices ya values ko store karne ke liye queue
        Queue<Integer> q = new LinkedList<>();

        int left = 0;
        // Aapka bataya hua Fixed Size Sliding Window format
        for (int right = 0; right < n; right++) {
            // 1. Agar current element negative hai, toh queue me daal do
            if (arr[right] < 0) {
                q.add(arr[right]);
            }

            // 2. Jab window ka size K ke barabar ho jaye
            if (right >= k - 1) {
                // Agar queue me elements hain, toh front wala hi first negative hai
                if (!q.isEmpty()) {
                    result[resultIndex++] = q.peek();
                } else {
                    result[resultIndex++] = 0; // Kkoi negative nahi mila
                }

                // 3. Window size exceed hote hi left element ko remove karne ki logic
                if (!q.isEmpty() && arr[left] == q.peek()) {
                    q.poll(); // Queue se nikal do kyunki ab ye window se bahar ja raha hai
                }
                left++; // Left pointer badhao window slide karne ke liye
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {12, -1, -7, 8, -15, 30};
        int k = 3;

        // Processing
        int[] result = firstNegativeNumber(arr, k);

        // Output Format
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(",");
        }
        System.out.println("]");
        // Output: [-1,-1,-7,-15]
    }
}

