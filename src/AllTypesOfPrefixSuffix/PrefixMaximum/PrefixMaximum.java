package AllTypesOfPrefixSuffix.PrefixMaximum;

public class PrefixMaximum {

    public static int[] calcMaximumTillIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Maximum store karne ke liye
        int[] prefixMax = new int[n];

        // Pehla element hi first maximum hoga
        prefixMax[0] = nums[0];

        // Har index tak ka maximum store karo
        for (int i = 1; i < n; i++) {

            // Previous maximum aur current element me se bada choose karo
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        return prefixMax;
    }

    public static void main(String[] args) {

        int[] nums = {3, 7, 2, 9, 5, 11, 4};

        int[] prefixMax = calcMaximumTillIndex(nums);

        System.out.print("Maximum Till Index = ");

        for (int max : prefixMax) {
            System.out.print(max + " ");
        }
    }
}