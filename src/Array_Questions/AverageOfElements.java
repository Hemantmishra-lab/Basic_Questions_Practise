package Array_Questions;

public class AverageOfElements{
    public static double calcAverageOfElements(int []arr){
        int sum = 0;for(int x:arr){sum+=x;}return (double)sum/arr.length;
    }
    public static void main(String[] args){
        int []arr = {1,2,6,8};
        System.out.println(calcAverageOfElements(arr));
    }
}