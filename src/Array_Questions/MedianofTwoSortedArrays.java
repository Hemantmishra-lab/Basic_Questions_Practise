package Array_Questions;

import java.util.Arrays;

//public class MedianofTwoSortedArrays {
//    public static double calcMedianOfTwoSortedArrays(int []arr1,int []arr2){
//        int []arr = new int[arr1.length+arr2.length];
//        for(int i=0;i<arr1.length;i++){
//            arr[i] = arr1[i];
//        }
//        for(int i=0;i<arr2.length;i++){
//            arr[arr1.length+i] = arr2[i];
//        }
//        Arrays.sort(arr);
//        int n = arr.length;
//        if(n%2==0)
//            return (arr[n/2]+arr[(n/2)+-1])/2.0;
//        else
//            return arr[n/2];
//
//    }
//    public static void main(String[] args){
//        int []arr1 = {1,3};
//        int []arr2 = {2};
//        System.out.printf("%.5f\n", calcMedianOfTwoSortedArrays(arr1, arr2));
//        int []arr3 = {1,2};
//        int arr4[] = {3,4};
//        System.out.println(calcMedianOfTwoSortedArrays(arr3,arr4));
//    }
//}
//
//public class MedianofTwoSortedArrays {
//    public static double calcMedianOfTwoSortedArrays(int []arr1,int []arr2){
//        int arr[]= new int[arr1.length+arr2.length];
//        for(int i=0;i<arr1.length;i++){
//            arr[i] = arr1[i];
//        }
//        for(int i=0;i<arr2.length;i++){
//            arr[i+arr1.length] = arr2[i];
//        }
//        int n = arr.length;
//        if(n%2==0)
//            return (arr[n/2]+arr[(n/2)-1])/2.0;
//        return arr[n/2];
//    }
//    public static void main(String[] args){
//        int []arr1 = {2,3,4};
//        int []arr2 = {1,6};
//        System.out.println(calcMedianOfTwoSortedArrays(arr1,arr2));
//    }
//}

public class MedianofTwoSortedArrays {
    public static double calcMedianOfTwoSortedArrays(int[] arr1,int[] arr2){
        int []temp = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            temp[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            temp[i+arr1.length] = arr2[i];
        }
        int n = temp.length;
        if(n%2==0)
            return (temp[n/2]+temp[(n/2)-1]);
        else
            return temp[n/2];
    }
    public static void main(String[] args){
        int []arr1 = {2,3,4};
        int []arr2 = {1,6};
        System.out.println(calcMedianOfTwoSortedArrays(arr1,arr2));
    }
}