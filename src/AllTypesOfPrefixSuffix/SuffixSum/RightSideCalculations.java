package AllTypesOfPrefixSuffix.SuffixSum;

public class RightSideCalculations {

    public static int[] calcRightSideSum(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Right Side Sum store karne ke liye
        int[] rightSum = new int[n];

        // Last index ke right me koi element nahi hota
        rightSum[n - 1] = 0;

        // Right se traverse karo
        // rightSum[i] = i ke right wale sabhi elements ka sum
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        return rightSum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};

        int[] rightSum = calcRightSideSum(nums);

        System.out.print("Right Side Sum = ");

        for (int sum : rightSum) {
            System.out.print(sum + " ");
        }
    }
}
