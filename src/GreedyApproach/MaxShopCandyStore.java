package GreedyApproach;

import java.util.*;

//public class MaxShopCandyStore {
//    public static int MaxShopCandy(int k,int[] arr){
//        Arrays.sort(arr);
//        int totalToffee = arr.length;
//        int forward = totalToffee - 1;
//        int backward = 0;
//        int maxcost = 0;
//        while(forward>=backward){
//            maxcost = maxcost + arr[forward];
//            forward --;
//            backward = backward +k;
//        }
//        return maxcost;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int m = sc.nextInt();
//        int []arr = new int[m];
//        for(int i=0;i<m;i++){
//            arr[i]=sc.nextInt();
//        }
//        int maxCost = MaxShopCandy(k,arr);
//        System.out.println(maxCost);
//    }
//}
//
//record OutputReturn( List<String> Tname,int minPrice){};
//record ListOutputFormat(String TName,int TPrice){}
//public class MaxShopCandyStore{
//    public static OutputReturn PriceCalc(String []TName,int TPrice[],int k){
//        int n = TName.length;
//        List<ListOutputFormat> list = new ArrayList<>();
//        for(int i=0;i<TName.length;i++){
//            list.add(new ListOutputFormat(TName[i],TPrice[i]));
//        }
//        Collections.sort(list,(a,b)->Integer.compare(a.TPrice(), b.TPrice()));
//        int forward = 0;
//        int backward = n-1;
//        int minPrice = 0;
//        List<String> outList = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            while(forward<=backward){
//                minPrice += list.get(forward).TPrice();
//                outList.add(list.get(forward).TName());
//                forward++;
//                backward-=k;
//            }
//        }
//        return new OutputReturn(outList,minPrice);
//    }
//    public static void main(String[] args){
//        String []TName = {"Parle-G","London Dairy","KitKAt","Snacker","Dairy Milk"};
//        int []TPrice = {1,5,10,15,20};
//        int k = 2;
//        System.out.println(PriceCalc(TName,TPrice,k));
//    }
//}