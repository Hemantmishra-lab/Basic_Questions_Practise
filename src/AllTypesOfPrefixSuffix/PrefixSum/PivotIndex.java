package AllTypesOfPrefixSuffix.PrefixSum;

public class PivotIndex {

    public static int findPivotIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Sum store karne ke liye
        int[] prefix = new int[n];

        // Pehla element direct copy hoga
        prefix[0] = nums[0];

        // Prefix Sum Build
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Total Sum = Last Prefix Sum
        int totalSum = prefix[n - 1];

        for (int i = 0; i < n; i++) {

            // Current index ke left ka sum
            int leftSum = (i == 0) ? 0 : prefix[i - 1];

            // Current index ke right ka sum
            int rightSum = totalSum - prefix[i];

            // Left aur Right sum equal hai to Pivot Index mil gaya
            if (leftSum == rightSum) {
                return i;
            }
        }

        // Pivot Index nahi mila
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int ans = findPivotIndex(nums);

        System.out.println("Pivot Index = " + ans);
    }
}