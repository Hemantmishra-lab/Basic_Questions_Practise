package Recursion;

//public class BinarySearch {
//    public static int calcBinarySearch(int []arr,int target,int low,int high){
//        if(low>high)
//            return -1;
//        int mid = (low+high)/2;
//        if(arr[mid] == target){
//            return mid;
//        }
//        if(arr[mid] > target){
//            return calcBinarySearch(arr,target,low,mid-1);
//        }
//        return calcBinarySearch(arr,target,mid+1,high);
//    }
//    public static void main(String[] args){
//        int arr[] = {10,20,40,50,80};
//        int target = 80;
//        int low = 0;
//        int high = arr.length-1;
//        System.out.println(calcBinarySearch(arr,target,low,high));
//    }
//}

public class BinarySearch{
    public static int calcBinarySearch(int []arr,int target,int low,int high){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid] == target)
            return mid;
        if(arr[mid]>target)
            return calcBinarySearch(arr,target,low,mid);
        return calcBinarySearch(arr,target,mid+1,high);
    }
    public static void main(String[] args){
        int []arr = {10,20,30,30,40};
        int target = 30;
        int low = 0;
        int high = arr.length-1;
        System.out.println(calcBinarySearch(arr,target,low,high));
    }
}