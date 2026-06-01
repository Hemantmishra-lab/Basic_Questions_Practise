package Pointers.SlidingWindow.VariableWindow;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        // Shuruat me minLength ko max bada value rakh diya comparison ke liye
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        // Aapka bataya hua Variable Sliding Window format
        int left = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right]; // Window ko expand kiya

            // CONDITION: Jab tak sum target ke barabar ya bada hai
            while (currentSum >= target) {
                // Minimum length update karo
                minLength = Math.min(minLength, right - left + 1);

                // Left element ko sum se hatao aur window shrink karo
                currentSum -= nums[left];
                left++;
            }
        }

        // Agar koi bhi valid subarray nahi mila toh 0 return karo, nahi toh minLength
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        // Input Format
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        // Output Process
        int result = minSubArrayLen(target, nums);
        System.out.println(result); // Output: 2
    }
}

