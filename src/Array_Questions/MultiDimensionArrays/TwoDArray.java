package Array_Questions.MultiDimensionArrays;

public class TwoDArray {
    public static void main(String[] args){
        int [][]arr = {{1,2},{4,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(i+" "+j+" "+arr[i][j]);
            }
        }
    }
}
