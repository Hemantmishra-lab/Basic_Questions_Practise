package Array_Questions;

public class FindMedian{
    public static int calcFindMedian(int[]arr){
        int n = arr.length;
        if(n%2==0){
            return (arr[n/2] + arr[(n/2)-1])/2;
        }
        return arr[n/2];
    }
    public static void main(String[]args){
        int []arr = {1,3,6,6,3,9};
        System.out.println(calcFindMedian(arr));
    }
}