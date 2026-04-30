package GreedyApproach;
//
import java.util.Arrays;
import java.util.Scanner;
//
//class Item{
//    int value,weight;
//    double ratio;
//    public Item(int value,int weight){
//        this.value = value;
//        this.weight= weight;
//        this.ratio = (double) value / (double) weight;
//    }
//}
//public class FractionalKnapsack {
//    public static double getMaxValue(int []value,int[]weight,int capacity){
//        int n = value.length;
//        Item[] items = new Item[n];
//        for(int i=0;i<n;i++){
//            items[i] = new Item(value[i],weight[i]);
//        }
//        Arrays.sort(items,(a,b)->Double.compare(b.ratio , a.ratio));
//        double totalTime = 0.0;
//        double totalMoney = 0.0;
//
//        for(int i=0;i<n;i++){
//            Item currentItem = items[i];
//            if(capacity - currentItem.weight >= 0){
//                totalMoney = totalMoney + currentItem.value;
//                capacity = capacity - currentItem.weight;
//            }
//            else{
//                    double fraction = (double)capacity / (double)currentItem.weight;
//                    totalMoney = totalMoney + (fraction * currentItem.value);
//                    break;
//            }
//        }
//        return totalMoney;
//    }
//    public static void main(String[] args){
//        int []value = {60,100,120};
//        int[] weight = {10,20,30};
//        int capacity = 50;
//        System.out.println(getMaxValue(value,weight,capacity));
//    }
//}

class Items{
    int value;
    int weight;
    double ratio;
    public Items(int value,int weight){
        this.value = value;
        this.weight  = weight;
        this.ratio = (double) value / (double)weight;
    }
}
public class FractionalKnapsack{

    public static double MaxValue(int[]value,int[] weight,int capacity){
        int n= value.length;
        Items []items = new Items[n];

        for(int i=0;i<n;i++){
            items[i] = new Items(value[i],weight[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(a.ratio , b.ratio));
        double MaxMoney = 0.0;
        for(int i=0;i<n;i++){
            Items currentItem = items[i];
            if(capacity -  currentItem.weight >= 0 ){
                capacity = capacity - currentItem.weight;
                MaxMoney = MaxMoney + currentItem.value;
            }
            else{
                double fraction = (double) capacity / (double) currentItem.weight;
                MaxMoney = MaxMoney + (fraction * currentItem.value);
                break;
            }
        }
        return MaxMoney;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []value = new int[n];
        int[] weight = new int[n];
        System.out.println("Enter the Capacity For the Bag : ");
        int capacity = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Value "+i);
            value[i]=sc.nextInt();
            System.out.println("Weight "+i);
            weight[i] = sc.nextInt();
        }
        System.out.println(MaxValue(value,weight,capacity));
    }
}