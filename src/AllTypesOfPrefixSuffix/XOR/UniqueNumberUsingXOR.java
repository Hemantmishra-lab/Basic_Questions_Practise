package AllTypesOfPrefixSuffix.XOR;

public class UniqueNumberUsingXOR {

    public static int calcUniqueNumber(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(1)

        int xor = 0;

        // Sabhi elements ka XOR karo
        // Same numbers cancel ho jayenge (a ^ a = 0)
        // Sirf unique number bach jayega
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        int uniqueNumber = calcUniqueNumber(nums);

        System.out.println("Unique Number = " + uniqueNumber);
    }
}
