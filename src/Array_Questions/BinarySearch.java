package Array_Questions;

public class BinarySearch{
    public static boolean calcBinarySearch(int []arr,int n){
        int left = 0;int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==n){
                return true;
            }
            else if(arr[mid]>n){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 8, 9, 12};
        int n = 12;
        System.out.println(calcBinarySearch(arr,n));
    }
}


