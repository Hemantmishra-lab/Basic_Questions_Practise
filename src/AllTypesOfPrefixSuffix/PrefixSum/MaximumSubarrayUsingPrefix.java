package AllTypesOfPrefixSuffix.PrefixSum;

public class MaximumSubarrayUsingPrefix {

    public static int findMaximumSubarraySum(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Sum store karne ke liye
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        // Prefix Sum Build
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Maximum Sum ko sabse chote possible value se initialize karo
        int maxSum = Integer.MIN_VALUE;

        // Prefix me ab tak ka minimum sum track karega
        int minPrefix = 0;

        for (int i = 0; i < n; i++) {

            // Current Prefix - Minimum Prefix
            // = Current index tak ka maximum subarray sum
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);

            // Future ke liye minimum prefix update karo
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = findMaximumSubarraySum(nums);

        System.out.println("Maximum Subarray Sum = " + ans);
    }
}
