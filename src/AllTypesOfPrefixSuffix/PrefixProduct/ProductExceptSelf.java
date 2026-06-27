package AllTypesOfPrefixSuffix.PrefixProduct;

public class ProductExceptSelf {

    public static int[] calcProductExceptSelf(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)
        // (Answer array ko extra space me count nahi karte according to LeetCode)

        int n = nums.length;

        // Prefix Product store karega
        int[] prefixProduct = new int[n];

        // Suffix Product store karega
        int[] suffixProduct = new int[n];

        // Answer store karega
        int[] result = new int[n];

        // Prefix Product Build
        prefixProduct[0] = 1;

        for (int i = 1; i < n; i++) {

            // Current index ke left tak ka product
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        // Suffix Product Build
        suffixProduct[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {

            // Current index ke right tak ka product
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
        }

        // Prefix × Suffix = Product Except Self
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct[i] * suffixProduct[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = calcProductExceptSelf(nums);

        System.out.print("Product Except Self = ");

        for (int product : result) {
            System.out.print(product + " ");
        }
    }
}