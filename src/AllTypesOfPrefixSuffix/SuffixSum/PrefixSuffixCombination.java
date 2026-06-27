package AllTypesOfPrefixSuffix.SuffixSum;

public class PrefixSuffixCombination {

    public static int[] calcPrefixSuffixSum(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Sum store karega
        int[] prefix = new int[n];

        // Suffix Sum store karega
        int[] suffix = new int[n];

        // Prefix Build
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Suffix Build
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        // Har index ke liye:
        // Left Sum + Right Sum (Current Element ko exclude karke)
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int leftSum = (i == 0) ? 0 : prefix[i - 1];

            int rightSum = (i == n - 1) ? 0 : suffix[i + 1];

            result[i] = leftSum + rightSum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};

        int[] result = calcPrefixSuffixSum(nums);

        System.out.print("Prefix + Suffix Combination = ");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}