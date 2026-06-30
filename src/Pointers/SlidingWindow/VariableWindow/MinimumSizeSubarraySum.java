package Pointers.SlidingWindow.VariableWindow;

//public class MinimumSizeSubarraySum {
//    public static int minSubArrayLen(int target, int[] nums) {
//        int n = nums.length;
//        // Shuruat me minLength ko max bada value rakh diya comparison ke liye
//        int minLength = Integer.MAX_VALUE;
//        int currentSum = 0;
//
//        // Aapka bataya hua Variable Sliding Window format
//        int left = 0;
//        for (int right = 0; right < n; right++) {
//            currentSum += nums[right]; // Window ko expand kiya
//
//            // CONDITION: Jab tak sum target ke barabar ya bada hai
//            while (currentSum >= target) {
//                // Minimum length update karo
//                minLength = Math.min(minLength, right - left + 1);
//
//                // Left element ko sum se hatao aur window shrink karo
//                currentSum -= nums[left];
//                left++;
//            }
//        }
//
//        // Agar koi bhi valid subarray nahi mila toh 0 return karo, nahi toh minLength
//        return minLength == Integer.MAX_VALUE ? 0 : minLength;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int target = 7;
//        int[] nums = {2, 3, 1, 2, 4, 3};
//
//        // Output Process
//        int result = minSubArrayLen(target, nums);
//        System.out.println(result); // Output: 2
//    }
//}

//public class MinimumSizeSubarraySum {
//    public static int calcMinimumSizeSubarraySum(int []arr,int target){
//        int curr = 0;int min = Integer.MAX_VALUE;
//        int left = 0;
//        for(int right=0;right<arr.length;right++){
//            curr += arr[right];
//            while(curr>=target){
//                min = Math.min(min,right-left+1);
//                curr -= arr[left];
//                left++;
//            }
//        }
//        return min==Integer.MAX_VALUE?0:min;
//    }
//    public static void main(String[] args){
//        int target = 7;
//        int[] nums = {2, 3, 1, 2, 4, 3};
//        System.out.println(calcMinimumSizeSubarraySum(nums,target));
//    }
//}

//public class MinimumSizeSubarraySum {
//    public static int calcMinimumSizeSubarraySum(int []arr,int target){
//        int curr = 0; int left = 0;int min = Integer.MAX_VALUE;
//        for(int right = 0;right<arr.length;right++){
//            curr += arr[right];
//            while(curr>=target){
//                min = Math.min(min,right-left+1);
//                curr -= arr[left];
//                left++;
//            }
//        }
//        return min==Integer.MAX_VALUE?0:min;
//    }
//    public static void main(String[] args){
//        int target = 7;
//        int[] nums = {2, 3, 1, 2, 4, 3};
//        System.out.println(calcMinimumSizeSubarraySum(nums,target));
//    }
//}

//public class MinimumSizeSubarraySum {
//    public static int calcMinimumSizeSbarraySum(int []arr,int target){
//        int currSum = 0; int min = Integer.MAX_VALUE;
//        int left = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            while (currSum>=target){
//                min = Math.min(min,right-left+1);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args){
//        int target = 7;
//        int[] arr = {2, 3, 1, 2, 4, 3};
//        System.out.println(calcMinimumSizeSbarraySum(arr,target));
//    }
//}

//public class MinimumSizeSubarraySum {
//    public static int calcMinimumSizeSubarraySum(int []arr,int target){
//        int currSum = 0;int left  = 0; int min = Integer.MAX_VALUE;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            while(currSum>=target){
//                min = Math.min(min,right-left+1);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args){
//        int target = 7;
//        int[] nums = {2, 3, 1, 2, 4, 3};
//        System.out.println(calcMinimumSizeSubarraySum(nums,target));
//    }
//}
//
//public class MinimumSizeSubarraySum {
//    public static int calcMinimumSizeSubarraySum(int []arr,int target){
//        int currSum = 0;int min = Integer.MAX_VALUE;
//        int left = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            while(currSum>=target){
//                min = Math.min(min,right-left+1);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args){
//        int target = 7;
//        int[] nums = {2, 3, 1, 2, 4, 3};
//        System.out.println(calcMinimumSizeSubarraySum(nums,target));
//    }
//}

public class MinimumSizeSubarraySum {
    public static int calcMinimumSizeSubarraySum(int[] arr,int target){
        int min = Integer.MAX_VALUE;int left = 0;
        int currSum = 0;
        for(int right = 0;right<arr.length;right++){
            currSum += arr[right];
            while(currSum>=target){
                min = Math.min(min,right-left+1);
                currSum -= arr[left];
                left++;
            }

        }
        return min;
    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(calcMinimumSizeSubarraySum(nums,target));
    }
}