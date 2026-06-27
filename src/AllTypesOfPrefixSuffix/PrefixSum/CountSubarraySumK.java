package AllTypesOfPrefixSuffix.PrefixSum;

import java.util.HashMap;

public class CountSubarraySumK {

    public static int countSubarraysWithSumK(int[] nums, int k) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        // Prefix Sum -> Frequency store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix Sum = 0 ek baar already exist karta hai
        // Ye un subarray ke liye important hai jo index 0 se start hoti hain
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            // Current Prefix Sum update karo
            prefixSum += num;

            // Agar (Current Prefix - K) pehle mil chuka hai
            // To utni subarrays ka sum K hoga
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Current Prefix Sum ki frequency update karo
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};

        int k = 2;

        int ans = countSubarraysWithSumK(nums, k);

        System.out.println("Count = " + ans);
    }
}
