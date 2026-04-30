package GreedyApproach;
//
import java.util.Arrays;
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


