package Array_Questions;

import java.util.HashMap;
import java.util.Map;

//public class TwoSum {
//    public static void calcTwoSum(int []arr,int target){
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++) {
//            int need = target - arr[i];
//            if(map.containsKey(need)){
//                System.out.println(map.get(need) + " " + i);
//                break;
//            }
//            map.put(arr[i],i);
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 7, 11, 15};
//        int target = 9;
//        calcTwoSum(arr,target);
//    }
//}

//
//public class TwoSum {
//    public static void calcTwoSum(int []arr,int target){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int need = target - arr[i];
//            if(map.containsKey(need)){
//                System.out.println(map.get(need) +" "+i);
//            }
//            map.put(arr[i],i);
//        }
//
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,7,0};
//        int target = 9;
//        calcTwoSum(arr,target);
//    }
//}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                int sum = nums[i] + nums[j];
//                if(sum == target){
//                    return new int []{i,j} ;
//                }
//            }
//        }
//        return new int[]{};
//    }
//
//}
//
//public class TwoSum {
//    public static void calcTwoSum(int []arr,int target){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int need = target - arr[i];
//            if(map.containsKey(need)){
//                System.out.println(map.get(need)+" "+i);
//            }
//            map.put(arr[i],i);
//        }
//
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,7,0};
//        int target = 9;
//        calcTwoSum(arr,target);
//    }
//}
//
//public class TwoSum {
//    public static void calcTwoSum(int []arr,int target){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int need = target - arr[i];
//            if(map.containsKey(need)){
//                System.out.println(map.get(need)+" "+i);
//            }
//            map.put(arr[i],i);
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,7,0};
//        int target = 9;
//        calcTwoSum(arr,target);
//    }
//}
//

public class TwoSum {
    public static int[] calcTwoSum(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int []arr = {1,2,7,0};
        int target = 9;
        int []arr2 = calcTwoSum(arr,target);
        for(int X:arr2)
            System.out.print(X+" ");
    }
}