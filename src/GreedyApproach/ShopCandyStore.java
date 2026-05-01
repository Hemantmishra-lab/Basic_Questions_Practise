package GreedyApproach;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

//public class ShopCandyStore {
//    public static int shopcandy(int []arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        int forward = 0;
//        int backward = n-1;
//        int sum = 0;
//        while(forward <= backward){
//            sum = sum + arr[forward];
//            forward ++;
//            backward = backward -2;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int result = shopcandy(arr);
//        System.out.println(result);
//    }
//}

//public class ShopCandyStore{
//    public static int MinCostToffes(int k,int [] arr){
//        Arrays.sort(arr);
//        int totalToffess = arr.length;
//        int forward = 0;
//        int backward = totalToffess - 1;
//        int mincost = 0;
//        while(forward<=backward){
//            mincost = mincost + arr[forward];
//            forward ++;
//            backward = backward -k;
//        }
//        return mincost;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("No of Free Toffees after one purchase: ");
//        int k = sc.nextInt();
//        System.out.println("Total Number of toffees: ");
//        int m = sc.nextInt();
//        System.out.println("Gives all the prices of the toffees: ");
//        int arr[] = new int[m];
//        for(int i=0;i<m;i++){
//            arr[i]=sc.nextInt();
//        }
//        int mincost = MinCostToffes(k,arr);
//        System.out.println(mincost);
//    }
//}

//public class ShopCandyStore{
//    public static int minPriceCandy(int []candyPrice,int n){
//        Arrays.sort(candyPrice);
//        int forward = 0;
//        int backward = candyPrice[n] - 1;
//        int minMoney = 0;
//       while(forward<=backward){
//           forward ++;
//           minMoney = minMoney + candyPrice[forward];
//           backward = backward -2;
//       }
//       return minMoney;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []candyPrice = new int[n];
//        for(int i=0;i<candyPrice.length;i++){
//            candyPrice[i]=sc.nextInt();
//        }
//        System.out.println(minPriceCandy(candyPrice,n));
//    }
//}


//public class ShopCandyStore{
//    public static int minPrice(int[]candyPrice){
//        int n = candyPrice.length;
//        Arrays.sort(candyPrice);
//        int forward = 0;
//        int backward = n-1;
//        int MinMoney = 0;
//        while(forward <= backward){
//            MinMoney = MinMoney + candyPrice[forward];
//            forward = forward + 1;
//            backward = backward -2;
//        }
//        return MinMoney;
//    }
//    public static void main(String[] args){
//        int[] candyPrice = {5,3,2,1,4};
//        int MinMoney = minPrice(candyPrice);
//        System.out.println(MinMoney);
//    }
//}

//public class ShopCandyStore{
//    public static int TotalPay(int []TPrice,int k){
//        Arrays.sort(TPrice);
//        int n = TPrice.length;
//        int forward = 0;
//        int backward = n-1;
//        int tPay = 0;
//        while(forward <= backward){
//            tPay += TPrice[forward];
//            forward++;
//            backward = backward - k;
//        }
//        return tPay;
//    }
//    public static void main(String[] args){
//        int[] TPrice = {6,4,1,2,10};
//        int k = 2;
//        System.out.println(TotalPay(TPrice,k));
//    }
//}
class TBook{
    int TPrice;
    String TName;
    public TBook(int TPrice,String TName){
        this.TPrice = TPrice;
        this.TName = TName;
    }
}
public class ShopCandyStore{
    public static String[] output(int[] TPrice,String[] TName,int k){
        int n = TPrice.length;
        int forward = 0;
        int backward = n-1;
        List<TBook> tList = new ArrayList<>();
        for(int i=0;i<n;i++){
            tList.add(new TBook(TPrice[i],TName[i]));
        }
        List<String> result = new ArrayList<>();
        Collections.sort(tList,(a,b)->Integer.compare(a.TPrice,b.TPrice));
        int TSpent = 0;
        while(forward <= backward){
           result.add(tList.get(forward).TName);
            TSpent = TSpent + tList.get(forward).TPrice;
            forward++;
            backward = backward - 2;

        }
        String[] array = result.toArray(new String[0]);
        return array;
    }
    public static void main(String[] args){
        int []TPrice = {6,4,1,2,10};
        String []TName = {"eclairs","Dairy Milk","Parle-G","London Dairy","Cadbuary"};
        int k = 2;
        String buyTName [] =output(TPrice,TName,k);
        for(int i=0;i< buyTName.length;i++){
            System.out.print(buyTName[i] +" ");
        }
    }
}