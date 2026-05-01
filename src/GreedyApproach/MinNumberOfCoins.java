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

//public class MinNumberOfCoins{
//    public static int minNoCoin(int[] CoinCollection,int k){
//        Arrays.sort(CoinCollection);
//        int n = CoinCollection.length;
//        int count = 0;
//        for(int i = n-1;i>=0;i--){
//            while(CoinCollection[i] <= k){
//                count++;
//                k = k - CoinCollection[i];
//            }
//        }
//        return  k==0?count:-1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []CoinCollection = new int[n];
//
//        for(int i=0;i<n;i++){
//            CoinCollection[i] = sc.nextInt();
//        }
//        System.out.println("Target ? : ");
//        int k = sc.nextInt();
//        System.out.println(minNoCoin(CoinCollection,k));
//    }
//}

//public class MinNumberOfCoins{
//    public static int minNoCoin(int[] CoinCollector,int amt){
//        Arrays.sort(CoinCollector);
//        int n = CoinCollector.length;
//        int count = 0;
//        for(int i=0;i<n;i++){
//            while(CoinCollector[i] <= amt){
//                count++;
//                amt = amt - CoinCollector[i];
//            }
//        }
//        return  amt == 0 ? count:-1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Target Amount : ");
//        int amt = sc.nextInt();
//        int n = sc.nextInt();
//        int[]CoinCollector = new int[n];
//        for(int i= 0;i<n;i++){
//            CoinCollector[i] = sc.nextInt();
//        }
//    }
//}

public class MinNumberOfCoins{
    public static int MinCoin(int[]CoinValues,int amt){
        Arrays.sort(CoinValues);
        int n = CoinValues.length;
        int CurrentValue = 0;
        int count = 0;
        int orgAmt = amt;
        for(int i=n-1;i>=0;i--){
            while(CoinValues[i] <= amt){
                CurrentValue  = CurrentValue + CoinValues[i];
                count++;
                amt = amt - CoinValues[i];

            }
        }
        if(orgAmt == CurrentValue)
            return count;
        return  -1;
    }
    public static void main(String[] args){
        int []CoinValues = {50,90,500,27,26,77,88};
        int amt = 153;
        System.out.println(MinCoin(CoinValues,amt));
    }
}

