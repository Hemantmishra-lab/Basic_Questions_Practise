package Array_Questions;

public class SecondMinimum {
    public static int calcSecondMin(int []arr){
        int Min = Integer.MAX_VALUE;
        int SecMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                SecMin = Min;
                Min = arr[i];
            }
        }
        return SecMin;
    }
    public static void main(String[] args){
        int []arr = {10,2,66,90};
        System.out.print(calcSecondMin(arr));
    }
}
