package AllTypesOfPrefixSuffix.PrefixDifferenceArray;

/*
LeetCode Pattern: 370. Range Addition (premium)

Time Complexity: O(n + q) (q = number of queries)
Space Complexity: O(n)
 */

public class RangeUpdateUsingDifferenceArray {

    public static int[] calcRangeUpdate(int[] nums, int[][] queries) {

        // Time Complexity : O(n + q)
        // Space Complexity: O(n)

        int n = nums.length;

        // Difference Array store karega
        int[] diff = new int[n];

        // Original Array se Difference Array Build
        diff[0] = nums[0];

        for (int i = 1; i < n; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }

        // Har Query apply karo
        // Query Format : {left, right, value}
        for (int[] query : queries) {

            int left = query[0];
            int right = query[1];
            int value = query[2];

            // Range Start par value add karo
            diff[left] += value;

            // Range ke baad value subtract karo
            if (right + 1 < n) {
                diff[right + 1] -= value;
            }
        }

        // Difference Array se Final Array Build
        nums[0] = diff[0];

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + diff[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        // {left, right, value}
        int[][] queries = {
                {1, 3, 5},
                {0, 2, 10},
                {2, 4, -3}
        };

        int[] result = calcRangeUpdate(nums, queries);

        System.out.print("Updated Array = ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
