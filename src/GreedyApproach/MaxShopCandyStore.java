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

//record ListFormatClass(int TPrice,String TName){}
//public class MaxShopCandyStore{
//    public static int calMaxShopCandyStore(int []TPrice,String[] TName,int k){
//        List<ListFormatClass> list = new ArrayList<>();
//        for(int i=0;i<TPrice.length;i++){
//            list.add(new ListFormatClass(TPrice[i],TName[i]));
//        }
//        Collections.sort(list,(a,b)->Integer.compare(a.TPrice(),b.TPrice()));
//        int forward = 0, backward = TPrice.length-1,TMoney=0;
//        while(forward <= backward){
//            TMoney += list.get(forward).TPrice();
//            forward++;
//            backward-=k;
//        }
//        return TMoney;
//    }
//    public static void main(String[] args){
//        String []TName = {"Parle-G","LondonDairy","Eclairs","KitKat","Cadbuary"};
//        int [] TPrice = {1,2,4,6,10};
//        int k =2;
//        System.out.println(calMaxShopCandyStore(TPrice,TName,k));
//    }
//}

public class MaxShopCandyStore {
    public static int calcMaxShopCandyStore(int []TPrice,int k){
        Arrays.sort(TPrice);
        int MinMney = 0;
        int forward = 0;
        int backward = TPrice.length;
        while(forward<backward){
            MinMney += TPrice[forward];
            forward++;
            backward -= k;
        }
        return MinMney;
    }
    public static void main(String[] args){
        int []TPrice = {1,6,32,8,7};
        int k = 2;
        System.out.println(calcMaxShopCandyStore(TPrice,k));
    }
}
//1 6 7 8 32