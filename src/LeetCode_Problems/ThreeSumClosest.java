package LeetCode_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        // 1. Sort the array
//        Arrays.sort(nums);
//
//        // Initial closest sum ko pehle teen elements ka sum maan lete hain
//        int closestSum = nums[0] + nums[1] + nums[2];
//
//        // 2. Loop for the first element
//        for (int i = 0; i < nums.length - 2; i++) {
//            int left = i + 1;
//            int right = nums.length - 1;
//
//            // 3. Two-pointer approach
//            while (left < right) {
//                int currentSum = nums[i] + nums[left] + nums[right];
//
//                // Agar currentSum target ke zyada paas hai, toh update karein
//                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
//                    closestSum = currentSum;
//                }
//
//                // 4. Move pointers based on sum comparison
//                if (currentSum < target) {
//                    left++; // Sum chota hai, badhane ke liye left aage badhao
//                } else if (currentSum > target) {
//                    right--; // Sum bada hai, ghatane ke liye right peeche lao
//                } else {
//                    // Agar exact match mil gaya, toh isse behtar kuch nahi ho sakta
//                    return currentSum;
//                }
//            }
//        }
//
//        return closestSum;
//    }
//}



// Remember : closest Sum, currentSum , How to handle both pointer.

//
//public class ThreeSumClosest { // Remember : closest Sum, currentSum , How to handle both pointer.
//    public static int calcThreeSumClosest(int []arr,int target){
//        Arrays.sort(arr);
//        int closestSum = arr[0] + arr[1] + arr[2];
//        for(int i=0;i<arr.length-2;i++){
//            int left = i+1;
//            int right = arr.length - 1;
//            while(left<right){
//                int currentSum = arr[i]  + arr[left] +arr[right];
//                if(Math.abs(currentSum-target) < Math.abs(closestSum - target)){
//                    closestSum = currentSum;
//                }
//                if(currentSum<target){
//                    left++;
//                } else if (currentSum>target) {
//                    right--;
//                }
//                else {
//                    return currentSum;
//                }
//            }
//        }
//        return closestSum;
//    }
//    public static void main(String[] args){
//        int []arr = {-1,2,1,-4};
//        int target = 1;
//        System.out.println(calcThreeSumClosest(arr,target));
//        int []arr2 = {0,0,0};
//        int target2 = 1;
//        System.out.println(calcThreeSumClosest(arr2,target2));
//    }
//}

public class ThreeSumClosest {
    public static int calcThreeSumClosest(int []arr,int target){
        Arrays.sort(arr);
        int closestSum  = arr[0] + arr[1] +arr[2];
        for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int currentSum = arr[i] + arr[left] +arr[right];
                if(Math.abs(currentSum- target)<Math.abs(closestSum - target)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                }
                else if(currentSum > target){
                    right--;
                }
                else{
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args){
        int []arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(calcThreeSumClosest(arr,target));
        int []arr2 = {0,0,0};
        int target2 = 1;
        System.out.println(calcThreeSumClosest(arr2,target2));
    }
}