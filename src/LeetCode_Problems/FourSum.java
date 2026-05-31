package LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> calcFourSum(int []arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j] == arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = arr.length-1;
                while(left<right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum==0){
                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;right--;
                        if(left<right && arr[left]==arr[left-1]){
                            left++;
                        }
                        if(left<right && arr[right] == arr[right+1]){
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
        System.out.println(calcFourSum(arr,target));
    }
}
