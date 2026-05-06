package Array_Questions;
import java.util.Scanner;
//Very Important : Wrraper class use Integer.Min_value
//public class SecondLargestElement {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int first = Integer.MIN_VALUE;
//        int second = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>first){
//                second = first;
//                first = arr[i];
//            } else if (arr[i]>second && arr[i]<first) {
//                second = arr[i];
//
//            }
//        }
//        System.out.println(first);
//        System.out.println(second);
//
//    }
//}

//public class SecondLargestElement{
//    public static int secLarge(int [] arr){
//        int Max = Integer.MIN_VALUE;
//        int SecMax = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                SecMax = Max;
//                Max =arr[i];
//            }
//            else if(arr[i]>SecMax && arr[i]<Max){
//                SecMax = arr[i];
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(secLarge(arr));
//    }
//}

public class SecondLargestElement{
    public static int secLargestNo(int []arr){
        int Max = Integer.MIN_VALUE;
        int SecMax = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>Max){
                SecMax = Max;
                Max = arr[i];
            } else if (arr[i]<Max && arr[i]>SecMax) {
                SecMax = arr[i];
            }
        }
        return SecMax;
    }
    public static void main(String[] args){
        int []arr = {10,8,4,3};
        System.out.println(secLargestNo(arr));
    }
}
