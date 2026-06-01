package Pointers.OppositeDirectionPointer;

public class TwoSumSortedArray {
    public static int[] calcTwoSumSortedArray(int []arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                return new int[]{arr[left], arr[right]};

            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[]arr = {1,2,4,6,10};
        int target = 8;
        int []temp = calcTwoSumSortedArray(arr,target);
        for(int X:temp)
            System.out.print(X+" ");
    }
}
