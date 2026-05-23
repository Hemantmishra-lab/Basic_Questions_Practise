package Array_Questions;

public class LargestNumber {
    public static int calcLargestNumber(int arr[]){
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max)
                Max = arr[i];
        }
        return Max;
    }
    public static void main(String[] args){
        int []arr = {10,230,30,20,1};
        System.out.print(calcLargestNumber(arr));
    }
}
