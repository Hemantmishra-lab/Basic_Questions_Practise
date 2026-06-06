package Array_Questions.MultiDimensionArrays;

public class UpperTriangle {
    public static void calcUpperTriangle(int [][]arr){
        int n  = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j< arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        calcUpperTriangle(arr);
    }
}
