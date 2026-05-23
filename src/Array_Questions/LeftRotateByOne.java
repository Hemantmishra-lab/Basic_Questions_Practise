package Array_Questions;

public class LeftRotateByOne {
    public static int[] calcLeftRotateByOne(int[]arr){
        int []temp = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        return temp;
    }
    public static void main(String[] args){
        int []arr = {8,2,3,5,6};
        int []temp = calcLeftRotateByOne(arr);
        for(int X : temp)
            System.out.print(X +" ");
    }
}
