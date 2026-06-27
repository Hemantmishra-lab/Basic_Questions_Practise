package AllTypesOfPrefixSuffix.PrefixCount;

public class PrefixEvenOddCount {

    public static void calcEvenOddCount(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Even Count store karega
        int[] prefixEven = new int[n];

        // Prefix Odd Count store karega
        int[] prefixOdd = new int[n];

        // Pehla element check karo
        if (nums[0] % 2 == 0) {
            prefixEven[0] = 1;
            prefixOdd[0] = 0;
        } else {
            prefixEven[0] = 0;
            prefixOdd[0] = 1;
        }

        // Prefix Count Build
        for (int i = 1; i < n; i++) {

            // Previous counts copy karo
            prefixEven[i] = prefixEven[i - 1];
            prefixOdd[i] = prefixOdd[i - 1];

            // Current element ke according count update karo
            if (nums[i] % 2 == 0) {
                prefixEven[i]++;
            } else {
                prefixOdd[i]++;
            }
        }

        System.out.print("Prefix Even Count = ");
        for (int count : prefixEven) {
            System.out.print(count + " ");
        }

        System.out.println();

        System.out.print("Prefix Odd Count = ");
        for (int count : prefixOdd) {
            System.out.print(count + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 8, 7, 6, 1, 4};

        calcEvenOddCount(nums);
    }
}
