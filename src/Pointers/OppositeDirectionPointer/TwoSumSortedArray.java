package Pointers.OppositeDirectionPointer;

//public class TwoSumSortedArray {
//    public static int[] calcTwoSumSortedArray(int []arr,int target){
//        int left = 0;
//        int right = arr.length-1;
//        while(left<right){
//            int sum = arr[left] + arr[right];
//            if(sum==target){
//                return new int[]{arr[left], arr[right]};
//
//            }
//            else if(sum<target){
//                left++;
//            }
//            else{
//                right--;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    public static void main(String[] args){
//        int[]arr = {1,2,4,6,10};
//        int target = 8;
//        int []temp = calcTwoSumSortedArray(arr,target);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class TwoSumSortedArray {
//    public static List calcTwoSortedArray(int []arr,int target){
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr.length-1;i++){
//            if(i>0 && arr[i]==arr[i-1])
//                continue;
//            for(int j=i+1;j<arr.length;j++){
//                if(j>j+1 && arr[j]==arr[j-1])
//                    continue;
//                int sum = arr[i] + arr[j];
//                if(sum == target){
//                    list.add(arr[i]);
//                    list.add(arr[j]);
//                    break;
//                }
//
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int[]arr = {1,2,4,6,10};
//        int target = 8;
//        System.out.println(calcTwoSortedArray(arr,target));
//    }
//}
public class TwoSumSortedArray {
    public static int[] calcTwoSumSortedArray(int []arr,int target){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int sum = arr[i] + arr[j];
                if(sum == target){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    break;
                }
            }
        }
        int []temp = new int[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i] = list.get(i);
        }
        return temp;
    }
    public static void main(String[] args){
        int []arr = {1,2,4,6,10};
        int target = 8;
        System.out.println(Arrays.toString(calcTwoSumSortedArray(arr,target)));
    }
}