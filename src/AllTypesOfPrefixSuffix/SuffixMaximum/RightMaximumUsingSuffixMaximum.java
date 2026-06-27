package AllTypesOfPrefixSuffix.SuffixMaximum;

public class RightMaximumUsingSuffixMaximum {

    public static int[] calcRightMaximum(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Right side ka maximum store karega
        int[] rightMax = new int[n];

        // Last index ke right me koi element nahi hota
        rightMax[n - 1] = -1;

        // Suffix Maximum Build
        // rightMax[i] = i ke right side ka maximum element
        for (int i = n - 2; i >= 0; i--) {

            // Current element aur right ke maximum me se bada choose karo
            rightMax[i] = Math.max(nums[i + 1], rightMax[i + 1]);
        }

        return rightMax;
    }

    public static void main(String[] args) {

        int[] nums = {5, 3, 8, 2, 7, 1, 9};

        int[] rightMax = calcRightMaximum(nums);

        System.out.print("Right Maximum = ");

        for (int max : rightMax) {
            System.out.print(max + " ");
        }
    }
}