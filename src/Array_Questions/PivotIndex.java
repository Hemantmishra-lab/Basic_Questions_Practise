package Array_Questions;

//public class PivotIndex {
//    public static int calcPivotIndex(int []arr){
//        int total = 0;
//        for(int X: arr)
//            total += X;
//        int lefttotal = 0;
//        for(int i=0;i<arr.length;i++){
//            if(lefttotal == total-arr[i]-lefttotal){
//                return i+1;
//            }
//            lefttotal += arr[i];
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {1, 7, 3, 6, 5, 6};
//        System.out.print(calcPivotIndex(arr));
//    }
//}

//public class PivotIndex {
//    public static int calcPivotIndex(int[]arr){
//        int TotalSum = 0;int leftSum = 0;
//        for(int X:arr)
//            TotalSum += X;
//        for(int i=0;i<arr.length;i++){
//            if(leftSum == TotalSum-leftSum-arr[i]){
//                return i;
//            }
//            leftSum += arr[i];
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {1, 7, 3, 6, 5, 6};
//        System.out.println(calcPivotIndex(arr));
//    }
//}
//
//public class PivotIndex {
//    public static int calcPivotIndex(int []arr){
//        int total = 0;int leftSum = 0;
//        for(int X :arr)
//            total += X;
//        for(int i=0;i<arr.length;i++){
//            if(leftSum == total-leftSum-arr[i]){
//                return i;
//            }
//            leftSum += arr[i];
//        }
//        return -1;
//    }
//    public static void main(String[]args){
//        int []arr = {1, 7, 3, 6, 5, 6};
//        System.out.println(calcPivotIndex(arr));
//    }
//}

//public class PivotIndex {
//    public static int calcPivotIndex(int []arr){
//        int Tsum = 0;
//        for(int X:arr)
//            Tsum += X;
//        int LSum = 0;
//        for(int i=0;i<arr.length;i++){
//            if(LSum == Tsum - arr[i] - LSum){
//                return i;
//            }
//            LSum += arr[i];
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {1, 7, 3, 6, 5, 6};
//        System.out.println(calcPivotIndex(arr));
//    }
//}

//public class PivotIndex {
//    public static int calcPivotIndex(int []arr){
//        int TSum = 0;
//        for(int X:arr)
//            TSum += X;
//        int LSum = 0;
//        for(int i=0;i<arr.length;i++){
//            if(LSum == TSum-arr[i]-LSum){
//                return i;
//            }
//            LSum += arr[i];
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {1, 7, 3, 6, 5, 6};
//        System.out.println(calcPivotIndex(arr));
//    }
//}

public class PivotIndex {
    public static int calcPivotIndex(int []arr){
        int total  = 0;
        int leftSum = 0;
        for(int X:arr)
            total += X;
        for(int i=0;i<arr.length;i++){
            if(leftSum == total - arr[i]-leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int []arr = {1, 7, 3, 6, 5, 6};
        System.out.println(calcPivotIndex(arr));
    }
}