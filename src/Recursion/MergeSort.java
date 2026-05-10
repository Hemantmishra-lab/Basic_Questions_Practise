package Recursion;

public class MergeSort {
    public static void merge(int []arr,int low,int high,int mid){
        int left = low,right = mid+1,index = 0;
        int []temp = new int[high-low+1];
        while(left <= mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                index++;left++;
            }
            else{
                temp[index] = arr[right];
                index++;right++;
            }
        }
        while(left <= mid){
            temp[index] = arr[left];
            index++;left++;
        }
        while(right<=high){
            temp[index] = arr[right];
            index++;right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    public static void sort(int []arr,int low,int high){
        if(low>= high)
            return;
        int mid = (low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }
    public static void main(String[] args){
        int []arr = {6,3,5,2,2,8,1,3,2,9};
        int low = 0;
        int high = arr.length-1;
        sort(arr,low,high);
        for(int X : arr)
            System.out.print(X +" ");
    }
}
