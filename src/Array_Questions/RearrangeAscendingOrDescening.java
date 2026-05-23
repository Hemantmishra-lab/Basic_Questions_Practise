package Array_Questions;


import java.util.Arrays;

public class RearrangeAscendingOrDescening {
    public static void  calcAscending(int []arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int []arr = {10,2,100,99,8,88};
        calcAscending(arr);
    }
}
