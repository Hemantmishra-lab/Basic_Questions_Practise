package AllTypesOfPrefixSuffix.XOR;

/*
LeetCode Equivalent: This exact problem is not on LeetCode.
 It is the famous "Count Subarrays with XOR = K" problem from coding interview platforms like Coding Ninjas,
 GeeksforGeeks, and InterviewBit.

Time Complexity: O(n)
Space Complexity: O(n)
 */
import java.util.HashMap;

public class SubarrayXOR {

    public static int calcSubarrayXOR(int[] nums, int k) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        // Prefix XOR -> Frequency store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix XOR = 0 ek baar pehle se exist karta hai
        map.put(0, 1);

        int prefixXOR = 0;
        int count = 0;

        for (int num : nums) {

            // Current Prefix XOR update karo
            prefixXOR ^= num;

            // Agar (Current Prefix XOR ^ K) pehle mil chuka hai
            // To utni subarrays ka XOR K hoga
            if (map.containsKey(prefixXOR ^ k)) {
                count += map.get(prefixXOR ^ k);
            }

            // Current Prefix XOR ki frequency update karo
            map.put(prefixXOR, map.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 2, 6, 4};

        int k = 6;

        int ans = calcSubarrayXOR(nums, k);

        System.out.println("Count = " + ans);
    }
}