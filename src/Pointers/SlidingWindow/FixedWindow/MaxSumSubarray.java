package Pointers.SlidingWindow.FixedWindow;

public class MaxSumSubarray {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int currentSum = 0;

        int left = 0;
        // Aapka bataya hua Fixed Size Sliding Window format
        for (int right = 0; right < n; right++) {
            currentSum += arr[right]; // Naya element window me add karo

            // Jab window ka size K ke barabar ho jaye (0-indexed array me right >= k-1)
            if (right >= k - 1) {
                // Maximum sum ko update karo
                maxSum = Math.max(maxSum, currentSum);

                // Window ko slide karne ke liye left element ko minus karo
                currentSum -= arr[left];
                left++; // Window size exceed hote hi left ko badhao
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // Output Process
        int result = findMaxSumSubarray(arr, k);
        System.out.println(result); // Output: 9
    }
}

