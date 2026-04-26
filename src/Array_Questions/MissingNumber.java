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

public class MissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = n+1;
        int expectedSum = t*(t+1)/2;
        System.out.println(expectedSum);
        int actualSum = 0;
        for(int i=0;i<arr.length;i++){
            actualSum = actualSum + arr[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
