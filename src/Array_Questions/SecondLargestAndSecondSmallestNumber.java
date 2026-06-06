package Array_Questions;

//public class SecondLargestAndSecondSmallestNumber{
//    public static void calcSecondLargestAndSmallest(int []arr){
//        int Max = Integer.MIN_VALUE, SecMax = Integer.MIN_VALUE;
//        int Min = Integer.MAX_VALUE,SecondMin = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                Max = arr[i];
//            } else if (arr[i]<Min) {
//                SecondMin = Min;
//                Min = arr[i];
//
//            } else if (arr[i]<Max && arr[i]>SecMax) {
//                SecMax = arr[i];
//            }
//
//        }
//        System.out.print("Sec Max : "+SecMax +"Sec Min : "+SecondMin);
//    }
//    public static void main(String[] args){
//        int []arr = {100,20,22,9,80};
//        calcSecondLargestAndSmallest(arr);
//    }
//}

public class SecondLargestAndSecondSmallestNumber {
    public static int[] calcSecondLargestAndSecondSmallestNumber(int []arr){
        int Max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        int Small = Integer.MAX_VALUE;
        int SecSmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                SecMax = Max;
                Max = arr[i];
            }
            else if(arr[i]<Max && arr[i]>SecMax){
                SecMax = arr[i];
            }
            if (arr[i]<Small) {
                SecSmall = Small;
                Small = arr[i];
            }

        }
        return new int[]{SecMax,SecSmall};
    }
    public static void main(String[] args){
        int []arr = {100,20,22,9,80};
        int []temp = calcSecondLargestAndSecondSmallestNumber(arr);
        for(int X: temp)
            System.out.print(X+" ");
    }
}