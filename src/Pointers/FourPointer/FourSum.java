package Pointers.FourPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

//public class FourSum {
//    public static List<List<Integer>> fourSum(int[] arr, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n = arr.length;
//
//        // 1. Array ko sort karna mandatory hai
//        Arrays.sort(arr);
//
//        // Outer Loop 1 (i)
//        for (int i = 0; i < n - 3; i++) {
//            // DUPLICATES SKIP (for i)
//            if (i > 0 && arr[i] == arr[i - 1]) continue;
//
//            // Inner Loop 2 (j)
//            for (int j = i + 1; j < n - 2; j++) {
//                // DUPLICATES SKIP (for j) - dhyan rakhna j > i + 1 hona chahiye
//                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
//
//                // Aapka bataya hua Two Pointer Setup
//                int left = j + 1;
//                int right = n - 1;
//
//                while (left < right) {
//                    // Integer Overflow se bachne ke liye long ka use kiya
//                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
//
//                    if (sum == target) {
//                        // Quadruplet mil gaya!
//                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
//
//                        // DUPLICATES SKIP (for left & right)
//                        while (left < right && arr[left] == arr[left + 1]) left++;
//                        while (left < right && arr[right] == arr[right - 1]) right--;
//
//                        left++;
//                        right--;
//                    }
//                    else if (sum < target) {
//                        left++; // Sum chhota hai toh left pointer badhao
//                    }
//                    else {
//                        right--; // Sum bada hai toh right pointer peeche lao
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//
//        // Processing
//        List<List<Integer>> quadruplets = fourSum(arr, target);
//
//        // Output Format
//        for (List<Integer> quad : quadruplets) {
//            System.out.println(quad);
//        }
//        // Output:
//        // [-2, -1, 1, 2]
//        // [-2, 0, 0, 2]
//        // [-1, 0, 0, 1]
//    }
//}
//
//public class FourSum {
//    public static List<int []> calcFourSum(int []arr,int target){
//        List<int []> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-2;j++){
//                if(j>i+1 && arr[j]==arr[j-1]){
//                    continue;
//                }
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
//                    if(sum == 0){
//                        list.add(new int[]{arr[i],arr[j],arr[left],arr[right]});
//                        left++;right--;
//                        while (left<right && arr[left]==arr[left-1])
//                            left++;
//                        while(left<right && arr[right]==arr[right+1])
//                            right--;
//                    }
//                    else if(sum<0)
//                        left++;
//                    else
//                        right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        List<int []> list = calcFourSum(arr,target);
//        for(int []X:list)
//            System.out.println(Arrays.toString(X));
//    }
//}

public class FourSum {
    public static List<int []> calcFourSum(int []arr,int target){
        Arrays.sort(arr);
        List<int []> list = new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>j+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = arr.length-1;
                while(left<right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum == 0){
                        list.add(new int[]{arr[i],arr[j],arr[left],arr[right]});
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
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<int []> list = calcFourSum(arr,target);
        for(int X[]:list)
            System.out.println(Arrays.toString(X));

    }
}