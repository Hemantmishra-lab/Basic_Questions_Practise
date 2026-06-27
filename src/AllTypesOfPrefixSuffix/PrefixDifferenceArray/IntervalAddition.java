package AllTypesOfPrefixSuffix.PrefixDifferenceArray;

public class IntervalAddition {

    public static int[] calcIntervalAddition(int length, int[][] updates) {

        // Time Complexity : O(n + q)
        // Space Complexity: O(n)
        // q = Number of Updates

        // Difference Array
        int[] diff = new int[length];

        // Har Update Apply Karo
        // Update Format : {left, right, value}
        for (int[] update : updates) {

            int left = update[0];
            int right = update[1];
            int value = update[2];

            // Range Start par value add karo
            diff[left] += value;

            // Range End ke baad value subtract karo
            if (right + 1 < length) {
                diff[right + 1] -= value;
            }
        }

        // Difference Array se Final Array Build
        int[] result = new int[length];

        result[0] = diff[0];

        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int length = 5;

        // {left, right, value}
        int[][] updates = {
                {1, 3, 2},
                {2, 4, 3},
                {0, 2, -2}
        };

        int[] result = calcIntervalAddition(length, updates);

        System.out.print("Updated Array = ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
