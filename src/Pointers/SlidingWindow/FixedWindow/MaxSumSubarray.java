package Pointers.SlidingWindow.FixedWindow;

//public class MaxSumSubarray {
//    public static int findMaxSumSubarray(int[] arr, int k) {
//        int n = arr.length;
//        int maxSum = 0;
//        int currentSum = 0;
//
//        int left = 0;
//        // Aapka bataya hua Fixed Size Sliding Window format
//        for (int right = 0; right < n; right++) {
//            currentSum += arr[right]; // Naya element window me add karo
//
//            // Jab window ka size K ke barabar ho jaye (0-indexed array me right >= k-1)
//            if (right >= k - 1) {
//                // Maximum sum ko update karo
//                maxSum = Math.max(maxSum, currentSum);
//
//                // Window ko slide karne ke liye left element ko minus karo
//                currentSum -= arr[left];
//                left++; // Window size exceed hote hi left ko badhao
//            }
//        }
//
//        return maxSum;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//
//        // Output Process
//        int result = findMaxSumSubarray(arr, k);
//        System.out.println(result); // Output: 9
//    }
//}
//
//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int currSum = 0;
//        int MaxSum = 0;
//        int left = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                MaxSum = Math.max(MaxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return MaxSum;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}
//
//public class MaxSumSubarray {
//    public static int  calcMaxSumSubarray(int []arr,int k){
//        int currSum = 0,MaxSum = 0,left  = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                MaxSum = Math.max(MaxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return MaxSum;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}
//
//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int left = 0;int currSum = 0;int maxSum = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                maxSum = Math.max(maxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return maxSum;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}

//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int left = 0;int currSum = 0;int maxSum = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                maxSum = Math.max(maxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return maxSum;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}
//
//public class MaxSumSubarray {
//    public static int calcMaxSumarray(int[]arr,int k){
//        int Max = 0;int left = 0;int currSum = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                Max = Math.max(Max,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return Max;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumarray(arr,k));
//    }
//}

//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int currSum = 0; int left = 0;int Max = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                Max = Math.max(Max,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//        }
//        return Max;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}
//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int left = 0;
//        int currSum = 0;int MaxSum = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                MaxSum = Math.max(MaxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//
//        }
//        return MaxSum;
//    }
//   public static void main(String[] args){
//       int[] arr = {2, 1, 5, 1, 3, 2};
//       int k = 3;
//       System.out.println(calcMaxSumSubarray(arr,k));
//   }
//}

//public class MaxSumSubarray {
//    public static int calcMaxSumSubarray(int []arr,int k){
//        int left = 0;int currSum = 0 ;int MaxSum = 0;
//        for(int right = 0;right<arr.length;right++){
//            currSum += arr[right];
//            if(right>=k-1){
//                MaxSum = Math.max(MaxSum,currSum);
//                currSum -= arr[left];
//                left++;
//            }
//
//        }
//        return MaxSum;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//        System.out.println(calcMaxSumSubarray(arr,k));
//    }
//}
public class MaxSumSubarray {
    public static int calcMaxSumSubarray(int []arr,int k){
        int left  = 0;int currSum = 0;int maxSum = 0;
        for(int right = 0;right<arr.length;right++){
            currSum += arr[right];
            if(right>=k-1){
                maxSum = Math.max(maxSum,currSum);
                currSum -= arr[left];
                left++;
            }
        }
        return maxSum;
    }
    public static void main(String[]arsg){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(calcMaxSumSubarray(arr,k));
    }
}