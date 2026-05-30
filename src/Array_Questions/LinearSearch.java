package Array_Questions;

import java.util.Scanner;

//public class LinearSearch{
//    public static int Search(int[] arr,int target){
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter your target number : ");
//        int target = sc.nextInt();
//        int result = Search(arr,target);
//        if(result != -1){
//            System.out.println(result);
//        }
//        else{
//            System.out.println("Element not found");
//        }
//        sc.close();
//    }
//}

//public class LinearSearch{
//    public static int LinarS(int target,int []arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int target = sc.nextInt();
//        int result = LinarS(target,arr);
//        if(result != -1)
//            System.out.println("It exists at "+ result);
//        else
//            System.out.println("No Such element");
//    }
//}
//
//public class LinearSearch{
//    public static int LinearS(int []arr,int target){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int target = sc.nextInt();
//        int result = LinearS(arr,target);
//        if(result != -1){
//            System.out.println("It exists at "+result);
//        }
//        else {
//            System.out.println("It does not exists "+result);
//        }
//    }
//}

//public class LinearSearch{
//    public static int calclinearSearch(int []arr,int N){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == N){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,5,10,99};
//        int N = 99;
//        System.out.println(calclinearSearch(arr,N));
//    }
//}

//public class LinearSearch {
//    public static int calcLinearSearch(int []arr,int target){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target)
//                return i;
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int []arr = {1,6,3,2,8,0};
//        int target = 0;
//        System.out.println(calcLinearSearch(arr,target));
//    }
//}

//public class LinearSearch {
//    public static int calcLinearSearch(int []arr,int target){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target)
//                return i;
//        }
//        return -1;
//    }
//    public static void main(String[]args){
//        int []arr = {1,3,2,7,4};
//        int target = 4;
//        System.out.println(calcLinearSearch(arr,target));
//    }
//}

public class LinearSearch {
    public static int calcLinearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int []arr = {1,3,431,2};
        int target = 2;
        System.out.println(calcLinearSearch(arr,target));
    }
}