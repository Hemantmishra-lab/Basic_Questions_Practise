package Array_Questions;

import java.util.*;

//public class FourSum {
//
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//
//        List<List<Integer>> result = new ArrayList<>();
//
//        Arrays.sort(nums);
//
//        int n = nums.length;
//
//        for (int i = 0; i < n - 3; i++) {
//
//            // Duplicate skip for i
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//
//            for (int j = i + 1; j < n - 2; j++) {
//
//                // Duplicate skip for j
//                if (j > i + 1 && nums[j] == nums[j - 1]) {
//                    continue;
//                }
//
//                int left = j + 1;
//                int right = n - 1;
//
//                while (left < right) {
//
//                    long sum = (long) nums[i]
//                            + nums[j]
//                            + nums[left]
//                            + nums[right];
//
//                    if (sum == target) {
//
//                        result.add(Arrays.asList(
//                                nums[i],
//                                nums[j],
//                                nums[left],
//                                nums[right]
//                        ));
//
//                        left++;
//                        right--;
//
//                        // Skip duplicate left
//                        while (left < right &&
//                                nums[left] == nums[left - 1]) {
//                            left++;
//                        }
//
//                        // Skip duplicate right
//                        while (left < right &&
//                                nums[right] == nums[right + 1]) {
//                            right--;
//                        }
//
//                    } else if (sum < target) {
//
//                        left++;
//
//                    } else {
//
//                        right--;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//
//        List<List<Integer>> ans = fourSum(nums, target);
//
//        System.out.println(ans);
//    }
//}


//public class FourSum {
//    public static List<List<Integer>> calcFourSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i] == arr[i-1]){
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
//                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
//                        left++;right--;
//                        while(left<right && arr[left] == arr[left-1]){
//                            left++;
//                        }
//                        while(left<right && arr[right] == arr[right+1]){
//                            right--;
//                        }
//                    }
//                    else if(sum <0){
//                        left++;
//                    }
//                    else{
//                        right--;
//                    }
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        System.out.println(calcFourSum(nums));
//    }
//}

//public class FourSum {
//    public static List<List<Integer>> calcFourSum(int []arr,int target){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i] == arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-2;j++){
//                if(j>i+1 && arr[j] == arr[j-1]){
//                    continue;
//                }
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                    long sum = (long) arr[i]+arr[j]+arr[left]+arr[right];
//                    if(sum == target){
//                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
//                        left++;right--;
//                        while(left<right && arr[left] == arr[left -1]){
//                            left++;
//                        }
//                        while (left<right && arr[right] == arr[right +1]){
//                            right--;
//                        }
//                    }
//                    else if(sum < target){
//                        left++;
//                    }
//                    else{
//                        right--;
//                    }
//
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        System.out.println(calcFourSum(nums,target));
//    }
//}

//public class FourSum {
//    public static List<List<Integer>> calcFourSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-2;j++){
//                if(j>i+1 && arr[j]==arr[j-1])
//                    continue;
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                   long sum =(long) arr[i] + arr[j] + arr[left] + arr[right];
//                   if(sum == 0){
//                      list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
//                      left++;right--;
//                      while(left<right && arr[left] == arr[left-1]){
//                          left++;
//                      }
//                      while(left<right && arr[right] == arr[right+1]){
//                          right--;
//                      }
//                   }
//                   else if(sum<0){
//                       left++;
//                   }
//                   else{
//                       right--;
//                   }
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        System.out.println(calcFourSum(arr));
//    }
//}
//
//public class FourSum {
//    public static List<List<Integer>> calcFourSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-3;j++){
//                if(j>i+1 && arr[j]==arr[j-1]){
//                    continue;
//                }
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
//                    if(sum == 0){
//                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
//                        left++;right--;
//                        while(arr[left] == arr[left-1]){
//                            left++;
//                        }
//                        while(arr[right] == arr[right-1]){
//                            right--;
//                        }
//                    }
//                    else if(sum<0){
//                        left++;
//                    }
//                    else {
//                        right--;
//                    }
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String []args){
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        System.out.println(calcFourSum(arr));
//    }
//}

//public class FourSum {
//    public static List<int []> calcFourSum(int []arr,int target){
//        Arrays.sort(arr);
//        List<int []> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-2;j++){
//                if(j>i+1 && arr[j]== arr[j-1]){
//                    continue;
//                }
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
//                    if(left<right && sum == target){
//                        list.add(new int []{arr[left],arr[right],arr[i],arr[j]});
//                        left++;right--;
//                        if(arr[left]== arr[left-1])
//                            left++;
//                        if(arr[right] == arr[right+1])
//                            right--;
//                    }
//                    else if(left<right && sum < target){
//                        left ++;
//                    }
//                    else{
//                        right--;
//                    }
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        List<int[]> list = calcFourSum(arr,target);
//        for(int []X:list){
//            System.out.println(Arrays.toString(X));
//          }
//    }
//}

//public class FourSum {
//    public static List<int []> calcFourSum(int []arr,int target){
//        Arrays.sort(arr);
//        List<int []> list = new ArrayList<>();
//        for(int i=0;i<arr.length-3;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            for(int j=i+1;j<arr.length-2;j++){
//                if(j>j+1 && arr[j] == arr[j-1]){
//                    continue;
//                }
//                int left = j+1;
//                int right = arr.length-1;
//                while(left<right){
//                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
//                    if(sum == 0){
//                        list.add(new int[]{arr[i],arr[j],arr[left],arr[right]});
//                        left++;right--;
//                        while(left<right && arr[left]==arr[left-1])
//                            left++;
//                        while (left<right && arr[right] == arr[right+1])
//                            right--;
//                    }
//                    else if(sum < target)
//                        left++;
//                    else
//                        right--;
//                }
//            }
//        }
//        return list;
//    }
//     public static void main(String[] args){
//         int[] arr = {1, 0, -1, 0, -2, 2};
//         int target = 0;
//         List<int []> list =calcFourSum(arr,target);
//         for(int []X:list)
//             System.out.println(Arrays.toString(X));
//     }
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
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = arr.length-1;
                while(left<right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum == 0){
                       list.add(new int[]{arr[i],arr[j],arr[left],arr[right]});
                       left++;right--;
                       while(left<right && arr[left] == arr[left-1]){
                           left++;
                       }
                       while(left<right && arr[right] == arr[right+1]){
                           right--;
                       }
                    }
                    else if(sum < 0){
                        left++;
                    }
                    else{
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
        for(int[] X:list)
            System.out.println(Arrays.toString(X));
    }
}