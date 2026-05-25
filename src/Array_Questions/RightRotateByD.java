//package Array_Questions;
//
//public class RightRotateByD {
//    public static int[] calcRightRotateByD(int []arr,int D){
//        int []temp = new int[arr.length];
//        for(int i=0;i<arr.length-D;i++){
//            temp[i+1] = arr[i];
//        }
//        for(int i= arr.length-D;i< arr.length;i++){
//            temp[i-arr.length-D] = arr[i];
//        }
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,3,4,5,6,7,8};
//        int D = 2;
//        int []temp = calcRightRotateByD(arr,D);
//        for(int X : temp)
//            System.out.print(X);
//    }
//}

//WRONG CODE
