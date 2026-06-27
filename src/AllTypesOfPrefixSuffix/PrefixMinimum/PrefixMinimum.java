package AllTypesOfPrefixSuffix.PrefixMinimum;

public class PrefixMinimum {

    public static int[] calcMinimumTillIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Minimum store karega
        int[] prefixMin = new int[n];

        // Pehla element hi first minimum hoga
        prefixMin[0] = nums[0];

        // Har index tak ka minimum store karo
        for (int i = 1; i < n; i++) {

            // Previous minimum aur current element me se chota choose karo
            prefixMin[i] = Math.min(prefixMin[i - 1], nums[i]);
        }

        return prefixMin;
    }

    public static void main(String[] args) {

        int[] nums = {7, 5, 8, 2, 6, 1, 9};

        int[] prefixMin = calcMinimumTillIndex(nums);

        System.out.print("Minimum Till Index = ");

        for (int min : prefixMin) {
            System.out.print(min + " ");
        }
    }
}
