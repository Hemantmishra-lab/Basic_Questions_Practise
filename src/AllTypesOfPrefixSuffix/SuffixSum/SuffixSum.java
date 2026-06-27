package AllTypesOfPrefixSuffix.SuffixSum;

public class SuffixSum {

    public static int[] calcSuffixSum(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Suffix Sum store karne ke liye
        int[] suffix = new int[n];

        // Last element direct copy hoga
        suffix[n - 1] = nums[n - 1];

        // Suffix Sum Build
        // suffix[i] = i se last index tak ka total sum
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        return suffix;
    }

    public static int calcSumAfterIndex(int[] nums, int index) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int[] suffix = calcSuffixSum(nums);

        // Agar last index hai to uske baad koi element nahi hai
        if (index == nums.length - 1) {
            return 0;
        }

        // index ke baad wale elements ka sum
        return suffix[index + 1];
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};

        int[] suffix = calcSuffixSum(nums);

        System.out.print("Suffix Sum = ");
        for (int sum : suffix) {
            System.out.print(sum + " ");
        }

        System.out.println();

        int index = 2;

        System.out.println("Sum After Index " + index + " = " + calcSumAfterIndex(nums, index));
    }
}