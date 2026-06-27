package AllTypesOfPrefixSuffix.PrefixSum;

public class SumOfSubarray {

    public static int calcSubarraySum(int[] nums, int left, int right) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        // Prefix Sum store karne ke liye
        int[] prefix = new int[nums.length];

        // Pehla element direct copy hoga
        prefix[0] = nums[0];

        // Har index tak ka total sum store karo
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Agar subarray index 0 se start ho rahi hai
        if (left == 0) {
            return prefix[right];
        }

        // Right tak ka sum - Left ke pehle tak ka sum
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 1, 6, 3, 5};

        int left = 2;
        int right = 5;

        int sum = calcSubarraySum(nums, left, right);

        System.out.println("Subarray Sum = " + sum);
    }
}
