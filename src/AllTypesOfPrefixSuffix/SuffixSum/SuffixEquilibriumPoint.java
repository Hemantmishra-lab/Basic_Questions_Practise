package AllTypesOfPrefixSuffix.SuffixSum;

public class SuffixEquilibriumPoint {

    public static int findSuffixEquilibriumPoint(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Sum store karega
        int[] prefix = new int[n];

        // Suffix Sum store karega
        int[] suffix = new int[n];

        // Prefix Sum Build
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Suffix Sum Build
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        // Har index par Left Sum aur Right Sum compare karo
        for (int i = 0; i < n; i++) {

            // Current index ke left ka sum
            int leftSum = (i == 0) ? 0 : prefix[i - 1];

            // Current index ke right ka sum
            int rightSum = (i == n - 1) ? 0 : suffix[i + 1];

            // Agar dono equal hain to Equilibrium Point mil gaya
            if (leftSum == rightSum) {
                return i;
            }
        }

        // Agar koi Equilibrium Point nahi mila
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-7, 1, 5, 2, -4, 3, 0};

        int ans = findSuffixEquilibriumPoint(nums);

        System.out.println("Suffix Equilibrium Point = " + ans);
    }
}
