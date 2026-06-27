package AllTypesOfPrefixSuffix.PrefixSum;

import java.util.HashMap;

public class CountSubarraysDivisibleByK {

    public static int countSubarraysDivisibleByK(int[] nums, int k) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        // Remainder -> Frequency store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 ek baar pehle se exist karta hai
        // Isse index 0 se start hone wali subarray handle ho jayegi
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            // Prefix Sum update karo
            prefixSum += num;

            // Java me negative remainder aa sakta hai
            // Isliye usse positive bana rahe hain
            int remainder = ((prefixSum % k) + k) % k;

            // Agar same remainder pehle bhi mila hai
            // To un sab subarrays ka sum k se divisible hoga
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            // Current remainder ki frequency update karo
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int ans = countSubarraysDivisibleByK(nums, k);

        System.out.println("Count = " + ans);
    }
}
