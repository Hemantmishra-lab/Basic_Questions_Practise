package Array_Questions;

public class SmallestNumber {
    public static int calcSmallestNumber(int []arr){
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min)
                Min = arr[i];
        }
        return Min;
    }
    public static void main(String[] args){
        int []arr = {10,2,1,0,3,9,20};
        System.out.print(calcSmallestNumber(arr));
    }
}
