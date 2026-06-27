package AllTypesOfPrefixSuffix.PrefixMinimum;

public class ArrayPartitionUsingPrefixMinimum {

    public static int findPartitionIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Prefix Maximum store karega
        int[] prefixMax = new int[n];

        // Suffix Minimum store karega
        int[] suffixMin = new int[n];

        // Prefix Maximum Build
        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Suffix Minimum Build
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        // Partition Point find karo
        for (int i = 0; i < n - 1; i++) {

            // Agar Left ka maximum <= Right ka minimum
            // To yahi valid partition hai
            if (prefixMax[i] <= suffixMin[i + 1]) {
                return i;
            }
        }

        // Agar partition possible nahi hai
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {5, 0, 3, 8, 6};

        int partitionIndex = findPartitionIndex(nums);

        System.out.println("Partition Index = " + partitionIndex);
    }
}