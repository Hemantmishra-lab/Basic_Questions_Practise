package LeetCode_Problems;

//public class TwoSum {
//    public static int[] calcTwoSum(int []arr,int target){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,7,9};
//        int target = 9;
//        int []temp = calcTwoSum(arr,target);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

import java.util.HashMap;

public class TwoSum{
    public static void calcTwoSum(int []arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need = target - arr[i];
            if(map.containsKey(need)){
                System.out.println(map.get(need)+" "+i);
            }
            map.put(arr[i],i);
        }
    }
    public static void main(String[] args){
        int []arr = {-1,2,7,-4};
        int target = 9;
        calcTwoSum(arr,target);
    }
}