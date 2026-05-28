package Array_Questions;

import java.util.Scanner;

//public class MissingNumber {
//    public static void main(String[] args){
//        int [] arr = {1,2,4,5,6};
//        int n = 6;
//        int expectedSum = n*(n+1)/2;
//        int actualSum = 0;
//        for(int i=0;i<arr.length;i++){
//            actualSum = actualSum + arr[i];
//        }
//        int missing = expectedSum - actualSum;
//        System.out.println(missing);
//    }
//}

//public class MissingNumber{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int t = n+1;
//        int expectedSum = t*(t+1)/2;
//        System.out.println(expectedSum);
//        int actualSum = 0;
//        for(int i=0;i<arr.length;i++){
//            actualSum = actualSum + arr[i];
//        }
//        int missingNumber = expectedSum - actualSum;
//        System.out.println(missingNumber);
//    }
//}

//public class MissingNumber{
//    public static int missingnumber(int []arr){
//        int n = arr.length;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            sum += arr[i];
//        }
//        int N = n+1;
//        int expectedSum = N * (N+1)/2;
//        int missingno = expectedSum - sum ;
//        return missingno;
//    }
//    public static void main(String[] args){
//        int []arr = {1,3,4,5};
//        System.out.println(missingnumber(arr));
//    }
//}
//
//public class MissingNumber{
//    public static int calcMissingNumber(int arr[]){
//        int actualSum = 0;
//        for(int X : arr){
//            actualSum += X;
//        }
//        int expectedSum = (arr.length+1)*(arr.length+2)/2;
//        int missingNumber = expectedSum - actualSum;
//        return missingNumber;
//    }
//    public static void main(String[] args){
//        int []arr = {1,3,4,5};
//        System.out.println(calcMissingNumber(arr));
//    }
//}

public class MissingNumber {
    public static int calcMissingNumber(int []arr){
        int actSum = 0;
        for(int X:arr)
            actSum += X;
        int expected = (arr.length+1) * (arr.length+2)/2;
        return expected-actSum;
    }
    public static void main(String[] args){
        int []arr = {1,2,3,5,6,7};
        System.out.println(calcMissingNumber(arr));
    }
}