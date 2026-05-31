package Array_Questions;

import java.util.*;

//public class ThreeSum {
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//
//        List<List<Integer>> result = new ArrayList<>();
//
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length - 2; i++) {
//
//            // Duplicate first element skip
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//
//
//            int left = i + 1;
//            int right = nums.length - 1;
//
//            while (left < right) {
//
//                int sum = nums[i] + nums[left] + nums[right];
//
//                if (sum == 0) {
//
//                    result.add(Arrays.asList(
//                            nums[i],
//                            nums[left],
//                            nums[right]
//                    ));
//
//                    left++;
//                    right--;
//
//                    // Duplicate left skip
//                    while (left < right &&
//                            nums[left] == nums[left - 1]) {
//                        left++;
//                    }
//
//                    // Duplicate right skip
//                    while (left < right &&
//                            nums[right] == nums[right + 1]) {
//                        right--;
//                    }
//
//                } else if (sum < 0) {
//
//                    left++;
//
//                } else {
//
//                    right--;
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//
//        List<List<Integer>> ans = threeSum(nums);
//
//        System.out.println(ans);
//    }
//}
//
//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-2;i++){
//            if(i<arr.length && arr[i] == arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length-1;
//            while(left<right){
//                int sum = arr[i] + arr[left] + arr[right];
//                if(sum == 0){
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                }
//                left++;
//                right--;
//                else if (sum>0) {
//                    left++;
//                }
//                else {
//                    right--;
//                }
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//    }
//}


//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-2;i++){
//            if(i>0 && arr[i] == arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length - 1;
//            while(left<right){
//                int sum = arr[i] + arr[left] + arr[right];
//                if(sum == 0){
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                    left++;right--;
//
//                    if(left<right && arr[left] == arr[left-1]){
//                        left++;
//                    }
//                    if(left<right && arr[right] == arr[right+1]){
//                        right--;
//                    }
//                } else if (sum<0) {
//                    left++;
//                }
//                else {
//                    right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(calcThreeSum(arr));
//    }
//}
//
//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-2;i++){
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length-1;
//            while(left<right){
//                int sum = arr[i]+arr[left]+arr[right];
//                if(sum == 0){
//                   list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                   left++;right--;
//                   if(left<right && arr[left]==arr[left-1]){
//                       left++;
//                   }
//                   if(left<right && arr[right]==arr[right-1]){
//                       right--;
//                   }
//                } else if (sum<0) {
//                    left++;
//                }
//                else {
//                    right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(calcThreeSum(arr));
//    }
//}
//
//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        int n = arr.length;
//        for(int i=0;i<n-2;i++){
//            if(i>0 && arr[i] == arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length -1;
//            while(left<right){
//                int sum = arr[i] + arr[left] + arr[right];
//                if(sum == 0){
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                    left++;right--;
//                    if(left<right && arr[left] == arr[left-1]){
//                        left++;
//                    }
//                    if(left<right && arr[right] == arr[right+1]){
//                        right--;
//                    }
//                }
//                else if(sum <0){
//                    left++;
//                }
//                else {
//                    right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(calcThreeSum(arr));
//    }
//}

//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-2;i++){
//            if(i>0 && arr[i] == arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length-1;
//            while(left<right){
//                int sum = arr[i] + arr[left] + arr[right];
//                if(sum == 0){
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                     left++;right--;
//                    if(left<right && arr[left] == arr[left-1]){
//                        left++;
//                    }
//                    if(left<right && arr[right] == arr[right+1]){
//                        right--;
//                    }
//                }
//                else if(sum<0){
//                    left++;
//                }
//                else{
//                    right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(calcThreeSum(arr));
//    }
//}

//public class ThreeSum {
//    public static List<List<Integer>> calcThreeSum(int []arr){
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<arr.length-2;i++){
//            if(i>0 && arr[i] == arr[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = arr.length - 1;
//            while(left<right){
//                int sum = arr[i] + arr[left] + arr[right];
//                if(sum == 0){  // while loop use here
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                    left++;right--;
//                    if(left<right && arr[left] == arr[left-1]){
//                        left++;
//                    }
//                    if(left<right && arr[right] == arr[right+1]){
//                        right--;
//                    }
//                }
//                else if(sum<0){
//                    left++;
//                }
//                else {
//                    right--;
//                }
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(calcThreeSum(arr));
//    }
//}

public class ThreeSum {
    public static List<List<Integer>> calcThreeSum(int []arr){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = arr.length - 1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == 0){
                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;right--;
                    while(left<right && arr[left]==arr[left-1]){
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
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(calcThreeSum(arr));
    }
}