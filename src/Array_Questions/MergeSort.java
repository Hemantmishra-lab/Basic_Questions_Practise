package Array_Questions;

public class MergeSort {
    public static void  merge(int []arr,int start,int end,int mid){
        int[] temp = new int[end-start+1];
        int index = 0;int left = start;int right = mid+1;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                left++;index++;
            }
            else{
                temp[index] = arr[right];
                index++;right++;
            }
        }
        while(left<=mid){
            temp[index] = arr[left];
            left++;index++;
        }
        while(right<=end){
            temp[index] = arr[right];
            right++;index++;
        }
        for(int i=start;i<=end;i++){
            arr[i] = temp[i-start];
        }
    }
    public static void sort(int []arr,int start,int end){
        if(start==end){
            return;
        }
        int mid = (start+end)/2;
        sort(arr,start,mid); //left
        sort(arr,mid+1,end);
        merge(arr,start,end,mid);
    }
    public static void main(String[] args){
        int []arr = {6,3,5,2,2,8,1,3,2,9};
        sort(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
