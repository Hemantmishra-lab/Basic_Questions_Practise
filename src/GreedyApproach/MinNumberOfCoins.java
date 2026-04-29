package GreedyApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class MinNumberOfCoins{
//    public static List<Integer> getMinimumCoin(int n,int [] arr){
//        Arrays.sort(arr);
//        List<Integer> result = new ArrayList<>();
//        for(int i=arr.length-1;i>=0;i--){
//            int coin = arr[i];
//            while(n>=coin){
//                if(coin<=n){
//                    n = n-coin;
//                    result.add(coin);
//                }
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        int n = 63;
//        int []arr = {1,5,10,25};
//        List<Integer> result = getMinimumCoin(n,arr);
////        System.out.println(result);
////        System.out.println(result.size());
//        System.out.println(result.size());
//    }
//}


//public class MinNumberOfCoins{
//    public static List<Integer> minNumber(int n,int []arr){
//        Arrays.sort(arr);
//        List<Integer> result = new ArrayList<>();
//        for(int i=arr.length-1;i>=0;i--){
//            int coin = arr[i];
//            if(n>=coin){
//                n = n - coin;
//                result.add(coin);
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []arr = new int[m];
//        for(int i=0;i<m;i++){
//            arr[i] = sc.nextInt();
//        }
//        List<Integer> result = minNumber(n,arr);
//        System.out.println(result.size());
//    }
//}

//public class MinNumberOfCoins{
//    public static int minNumber(int n,int[]arr){
//        Arrays.sort(arr);
//        int count = 0;
//        for(int i = arr.length-1;i >= 0; i--){
//            while (arr[i] <= n) {
//                n = n - arr[i];
//                count++;
//            }
//        }
//        return n == 0 ? count : -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int arr[]= new int[m];
//        for(int i=0;i<m;i++){
//            arr[i]=sc.nextInt();
//        }
//        int result = minNumber(n,arr);
//        System.out.println(result);
//    }
//}

public class MinNumberOfCoins{
    public static int minNoCoin(int[] CoinCollection,int k){
        Arrays.sort(CoinCollection);
        int n = CoinCollection.length;
        int count = 0;
        for(int i = n-1;i>=0;i--){
            while(CoinCollection[i] <= k){
                count++;
                k = k - CoinCollection[i];
            }
        }
        return  k==0?count:-1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []CoinCollection = new int[n];

        for(int i=0;i<n;i++){
            CoinCollection[i] = sc.nextInt();
        }
        System.out.println("Target ? : ");
        int k = sc.nextInt();
        System.out.println(minNoCoin(CoinCollection,k));
    }
}