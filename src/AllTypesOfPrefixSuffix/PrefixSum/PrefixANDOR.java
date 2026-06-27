package AllTypesOfPrefixSuffix.PrefixSum;

public class PrefixANDOR {

    public static int[] calcPrefixAND(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix AND store karne ke liye
        int[] prefixAND = new int[n];

        // Pehla element direct copy hoga
        prefixAND[0] = nums[0];

        // Prefix AND Build
        // prefixAND[i] = 0 se i tak ka Bitwise AND
        for (int i = 1; i < n; i++) {
            prefixAND[i] = prefixAND[i - 1] & nums[i];
        }

        return prefixAND;
    }

    public static int[] calcPrefixOR(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix OR store karne ke liye
        int[] prefixOR = new int[n];

        // Pehla element direct copy hoga
        prefixOR[0] = nums[0];

        // Prefix OR Build
        // prefixOR[i] = 0 se i tak ka Bitwise OR
        for (int i = 1; i < n; i++) {
            prefixOR[i] = prefixOR[i - 1] | nums[i];
        }

        return prefixOR;
    }

    public static void main(String[] args) {

        int[] nums = {7, 3, 5, 1};

        int[] prefixAND = calcPrefixAND(nums);
        int[] prefixOR = calcPrefixOR(nums);

        System.out.print("Prefix AND = ");
        for (int value : prefixAND) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("Prefix OR = ");
        for (int value : prefixOR) {
            System.out.print(value + " ");
        }
    }
}