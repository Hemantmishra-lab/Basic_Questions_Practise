package Array_Questions;

//public class SumElementsOfTheArray {
//    public static int calcSumElements(int[]arr){
//        int Sum = 0;
//        for(int i=0;i<arr.length;i++){
//            Sum += arr[i];
//        }
//        return Sum;
//    }
//    public static void main(String[] args){
//        int []arr = {100,9,8,102,4};
//        System.out.print(calcSumElements(arr));
//    }
//}

public class SumElementsOfTheArray {
    public static int calcSumElementsOfTheArray(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int []arr = {100,9,8,102,4};
        System.out.println(calcSumElementsOfTheArray(arr));
    }
}