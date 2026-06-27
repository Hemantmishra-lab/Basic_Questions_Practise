package AllTypesOfPrefixSuffix.PrefixXOR;

public class PrefixXORQuery {

    public static int calcXORQuery(int[] nums, int left, int right) {

        // Time Complexity : O(n)  -> Prefix XOR Build
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix XOR store karega
        int[] prefixXOR = new int[n];

        // Pehla element direct copy hoga
        prefixXOR[0] = nums[0];

        // Prefix XOR Build
        // prefixXOR[i] = 0 se i tak ka XOR
        for (int i = 1; i < n; i++) {
            prefixXOR[i] = prefixXOR[i - 1] ^ nums[i];
        }

        // Agar query index 0 se start ho rahi hai
        if (left == 0) {
            return prefixXOR[right];
        }

        // XOR Query
        // (0...right) XOR (0...left-1) = (left...right)
        return prefixXOR[right] ^ prefixXOR[left - 1];
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 7, 3, 1};

        int left = 1;
        int right = 3;

        int ans = calcXORQuery(nums, left, right);

        System.out.println("XOR Query = " + ans);
    }
}