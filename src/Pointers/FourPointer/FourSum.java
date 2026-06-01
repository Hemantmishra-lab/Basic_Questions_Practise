package Pointers.FourPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        // 1. Array ko sort karna mandatory hai
        Arrays.sort(arr);

        // Outer Loop 1 (i)
        for (int i = 0; i < n - 3; i++) {
            // DUPLICATES SKIP (for i)
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Inner Loop 2 (j)
            for (int j = i + 1; j < n - 2; j++) {
                // DUPLICATES SKIP (for j) - dhyan rakhna j > i + 1 hona chahiye
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // Aapka bataya hua Two Pointer Setup
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    // Integer Overflow se bachne ke liye long ka use kiya
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        // Quadruplet mil gaya!
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        // DUPLICATES SKIP (for left & right)
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target) {
                        left++; // Sum chhota hai toh left pointer badhao
                    }
                    else {
                        right--; // Sum bada hai toh right pointer peeche lao
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        // Processing
        List<List<Integer>> quadruplets = fourSum(arr, target);

        // Output Format
        for (List<Integer> quad : quadruplets) {
            System.out.println(quad);
        }
        // Output:
        // [-2, -1, 1, 2]
        // [-2, 0, 0, 2]
        // [-1, 0, 0, 1]
    }
}

