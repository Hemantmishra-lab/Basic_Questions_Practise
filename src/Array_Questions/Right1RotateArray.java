package Array_Questions;



public class Right1RotateArray {
    public static int[] calcRight1RotateArray(int []arr){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            temp[i+1] = arr[i];
        }
        temp[0] = arr[arr.length-1];
        return temp;
    }
    static void main() {
        int[]arr = {1,2,3,4,5,6,7,8};
        int []temp = calcRight1RotateArray(arr);
        for(int X : temp)
            System.out.print(X +" ");
    }
}
