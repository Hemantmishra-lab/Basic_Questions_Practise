package AllTypesOfPrefixSuffix.PrefixSum;

public class PrefixXOR {

    public static int[] calcPrefixXOR(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix XOR store karne ke liye
        int[] prefixXOR = new int[n];

        // Pehla element direct copy hoga
        prefixXOR[0] = nums[0];

        // Prefix XOR Build
        // prefixXOR[i] = 0 se i tak ka XOR
        for (int i = 1; i < n; i++) {
            prefixXOR[i] = prefixXOR[i - 1] ^ nums[i];
        }

        return prefixXOR;
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 7, 3};

        int[] prefixXOR = calcPrefixXOR(nums);

        System.out.print("Prefix XOR = ");

        for (int xor : prefixXOR) {
            System.out.print(xor + " ");
        }
    }
}
