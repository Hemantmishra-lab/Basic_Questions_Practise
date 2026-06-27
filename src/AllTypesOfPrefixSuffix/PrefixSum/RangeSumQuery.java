package AllTypesOfPrefixSuffix.PrefixSum;

public class RangeSumQuery {

    public static int calcRangeSumQuery(int[] nums, int left, int right) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        // Prefix Sum store karne ke liye
        int[] prefix = new int[nums.length];

        // Pehla element direct copy hoga
        prefix[0] = nums[0];

        // Har index tak ka total sum store karo
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Agar range 0 se start ho rahi hai
        if (left == 0) {
            return prefix[right];
        }

        // Right tak ka sum - Left ke pehle tak ka sum
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int left = 1;
        int right = 3;

        int ans = calcRangeSumQuery(nums, left, right);

        System.out.println("Range Sum = " + ans);
    }
}
