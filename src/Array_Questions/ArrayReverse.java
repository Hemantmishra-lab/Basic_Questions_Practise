package Array_Questions;

import java.util.Arrays;

public class ArrayReverse{
    public static int[] calcArrayReverse(int []arr){
        int []rev = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }
    public static void main(String[] args){
        int []arr = {1,4,2,7};
        System.out.println(Arrays.toString(calcArrayReverse(arr)));
    }
}

class ArrayReverse2{
    public static int[] calcArrayReverse(int[]arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int []arr = {1,4,2,7};
        System.out.println(Arrays.toString(calcArrayReverse(arr)));
    }
}

class ArrayReverse3{
    public static int[] calcArrayReverse(int []arr){
        int left = 0;int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
        return arr;
    }
    public static void main(String[] args){
        int []arr = {1,4,2,7};
        System.out.println(Arrays.toString(calcArrayReverse(arr)));
    }
}