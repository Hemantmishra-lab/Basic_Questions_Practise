package AllTypesOfPrefixSuffix.SuffixMinimum;

public class SuffixMinimum {

    public static int[] calcMinimumAfterIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Suffix Minimum store karega
        int[] suffixMin = new int[n];

        // Last index ke baad koi element nahi hota
        suffixMin[n - 1] = Integer.MAX_VALUE;

        // Right se traverse karo
        // suffixMin[i] = i ke right side ka minimum element
        for (int i = n - 2; i >= 0; i--) {

            // Current right element aur future minimum me se chota choose karo
            suffixMin[i] = Math.min(nums[i + 1], suffixMin[i + 1]);
        }

        return suffixMin;
    }

    public static void main(String[] args) {

        int[] nums = {7, 5, 8, 2, 6, 1, 9};

        int[] suffixMin = calcMinimumAfterIndex(nums);

        System.out.print("Minimum After Index = ");

        for (int min : suffixMin) {
            System.out.print(min + " ");
        }
    }
}
