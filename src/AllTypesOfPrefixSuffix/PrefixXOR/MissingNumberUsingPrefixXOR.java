package AllTypesOfPrefixSuffix.PrefixXOR;

/*
LeetCode: 268. Missing Number

Time Complexity: O(n)

Space Complexity: O(1)

🔥 Note for your Repository

Ye Prefix XOR category me nahi aata. Isme running XOR use hota hai, Prefix XOR array nahi banta.

Repository Structure:

✅ Prefix XOR Query (LC 1310)
✅ Count Subarray XOR = K
❌ Missing Number (Running XOR Pattern)
❌ Single Number (Running XOR Pattern)
❌ Find Duplicate/Missing using XOR (Running XOR Pattern)
 */
public class MissingNumberUsingPrefixXOR {

    public static int calcMissingNumber(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(1)

        int n = nums.length;

        int xor = 0;

        // 0 se n tak ke saare numbers ka XOR
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // Array ke saare elements ka XOR
        for (int num : nums) {
            xor ^= num;
        }

        // Jo number bach jayega wahi missing number hoga
        return xor;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int missingNumber = calcMissingNumber(nums);

        System.out.println("Missing Number = " + missingNumber);
    }
}