package Pointers.ThreePointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class ThreeSum {
//    public static List<List<Integer>> threeSum(int[] arr) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n = arr.length;
//
//        // 1. Array ko sort karna sabse pehla aur zaroori step hai
//        Arrays.sort(arr);
//
//        // Aapka bataya hua Loop setup
//        for (int i = 0; i < n - 2; i++) {
//            // DUPLICATES SKIP (for i): Agar current element pichle element jaisa hi hai
//            if (i > 0 && arr[i] == arr[i - 1]) {
//                continue;
//            }
//
//            // Two Pointer Setup
//            int left = i + 1;
//            int right = n - 1;
//
//            while (left < right) {
//                int sum = arr[i] + arr[left] + arr[right];
//
//                if (sum == 0) {
//                    // Triplet mil gaya, list mein daalo
//                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
//
//                    // DUPLICATES SKIP (for left & right): Agle matching elements ko skip karo
//                    while (left < right && arr[left] == arr[left + 1]) left++;
//                    while (left < right && arr[right] == arr[right - 1]) right--;
//
//                    // Pointers ko aage badhao
//                    left++;
//                    right--;
//                }
//                else if (sum < 0) {
//                    left++; // Sum chhota hai toh left badhao
//                }
//                else {
//                    right--; // Sum bada hai toh right ghatao
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//
//        // Processing
//        List<List<Integer>> triplets = threeSum(arr);
//
//        // Output Format
//        for (List<Integer> triplet : triplets) {
//            System.out.println(triplet);
//        }
//        // Output:
//        // [-1, -1, 2]
//        // [-1, 0, 1]
//    }
//}

public class ThreeSum {
    public static List<int []> calcThreeSum(int []arr){
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    list.add(new int[]{arr[i],arr[left],arr[right]});
                    left++;right--;
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(left<right && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<int[]> list = calcThreeSum(arr);
        for(int []X:list)
            System.out.println(Arrays.toString(X));
    }
}