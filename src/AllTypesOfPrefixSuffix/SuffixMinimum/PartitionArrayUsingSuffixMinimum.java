package AllTypesOfPrefixSuffix.SuffixMinimum;

public class PartitionArrayUsingSuffixMinimum {

    public static int findPartitionIndex(int[] nums) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = nums.length;

        // Left side ka maximum track karega
        int leftMax = nums[0];

        // Suffix Minimum store karega
        int[] suffixMin = new int[n];

        // Last element hi last minimum hoga
        suffixMin[n - 1] = nums[n - 1];

        // Suffix Minimum Build
        // suffixMin[i] = i se last tak ka minimum
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        // Partition Point find karo
        for (int i = 0; i < n - 1; i++) {

            // Left side ka maximum update karo
            leftMax = Math.max(leftMax, nums[i]);

            // Agar Left Max <= Right Min
            // To yahi valid partition hai
            if (leftMax <= suffixMin[i + 1]) {
                return i;
            }
        }

        // Partition possible nahi hai
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {5, 0, 3, 8, 6};

        int partitionIndex = findPartitionIndex(nums);

        System.out.println("Partition Index = " + partitionIndex);
    }
}