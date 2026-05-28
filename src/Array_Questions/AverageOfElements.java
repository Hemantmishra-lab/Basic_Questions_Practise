package Array_Questions;

//public class AverageOfElements {
//    public static double calcAverageOfElements(int []arr){
//        int n = arr.length;
//        int sum = 0;
//        for(int X : arr)
//            sum += X;
//        double avg = sum/n;
//        return avg;
//    }
//    public static void main(String[] args){
//        int []arr = {1,5,23,7,8};
//        System.out.print(calcAverageOfElements(arr));
//    }
//}


public class AverageOfElements {
    public static double calcAvergaeOfElements(int[]arr){
        int sum = 0;
        for(int X:arr)
            sum += X;
        return sum/ arr.length;
    }
    public static void main(String[] args){
        int []arr = {4,5,8,9,1};
        System.out.println(calcAvergaeOfElements(arr));
    }
}