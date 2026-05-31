package GreedyApproach;
//
import java.util.*;
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

//class Items{
//    int value;
//    int weight;
//    double ratio;
//    public Items(int value,int weight){
//        this.value = value;
//        this.weight  = weight;
//        this.ratio = (double) value / (double)weight;
//    }
//}
//public class FractionalKnapsack{
//
//    public static double MaxValue(int[]value,int[] weight,int capacity){
//        int n= value.length;
//        Items []items = new Items[n];
//
//        for(int i=0;i<n;i++){
//            items[i] = new Items(value[i],weight[i]);
//        }
//        Arrays.sort(items,(a,b)->Double.compare(a.ratio , b.ratio));
//        double MaxMoney = 0.0;
//        for(int i=0;i<n;i++){
//            Items currentItem = items[i];
//            if(capacity -  currentItem.weight >= 0 ){
//                capacity = capacity - currentItem.weight;
//                MaxMoney = MaxMoney + currentItem.value;
//            }
//            else{
//                double fraction = (double) capacity / (double) currentItem.weight;
//                MaxMoney = MaxMoney + (fraction * currentItem.value);
//                break;
//            }
//        }
//        return MaxMoney;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []value = new int[n];
//        int[] weight = new int[n];
//        System.out.println("Enter the Capacity For the Bag : ");
//        int capacity = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.print("Value "+i);
//            value[i]=sc.nextInt();
//            System.out.println("Weight "+i);
//            weight[i] = sc.nextInt();
//        }
//        System.out.println(MaxValue(value,weight,capacity));
//    }
//}
//record ListFormatClass(int value,int weight,double ratio){
//    public ListFormatClass(int value,int weight){
//        this(value,weight,(double) value / (double) weight);
//    }
//}
//public class FractionalKnapsack{
//    public static double MaxPriceItem(int []value,int []weight,int N){
//        List<ListFormatClass> list = new ArrayList<>();
//        for(int i=0;i< value.length;i++){
//            list.add(new ListFormatClass(value[i],weight[i]));
//        }
//        Collections.sort(list,(a,b)->Double.compare(b.ratio(), a.ratio()));
//        int CWeight = 0;
//        double MaxValue = 0.0;
//        for(int i=0;i<value.length;i++){
//            CWeight=list.get(i).weight();
//            if(N >= CWeight){
//                MaxValue += list.get(i).value();
//                N -= CWeight;
//            }
//            else{
//                double fraction = (double) N /(double) CWeight;
//                MaxValue += (fraction * list.get(i).value());
//                break;
//            }
//        }
//        return MaxValue;
//    }
//    public static void main(String[] args){
//        int [] value = {60,100,120};
//        int []weight = {10,20,30};
//        int N = 50;
//        System.out.println(MaxPriceItem(value,weight,N));
//    }
//}
//
//record ListClassOutput(int value,int weight,double ratio){
//    public ListClassOutput(int value,int weight){this(value,weight,(double)value/(double) weight);}
//}
//public class FractionalKnapsack{
//    public static double calFractionalKnapsack(int []value,int []weight,int N){
//        List<ListClassOutput> list = new ArrayList<>();
//        for(int i=0;i<value.length;i++){
//            list.add(new ListClassOutput(value[i],weight[i]));
//        }
//        Collections.sort(list,(a,b)->Double.compare(b.ratio(),a.ratio()));
//        double MoneyTotal = 0;
//        for(int i=0;i<list.size();i++){
//            if(N>list.get(i).weight()){
//                N -= list.get(i).weight();
//                MoneyTotal += list.get(i).value();
//            }
//            else{
//                double fraction = N / list.get(i).weight();
//                MoneyTotal += fraction * list.get(i).value();
//                N=0;
//            }
//        }
//        return MoneyTotal;
//    }
//    public static void main(String[] args){
//        int []value = {60,100,120};
//        int []weight = {10,20,30};
//        int N = 50;
//        System.out.println(calFractionalKnapsack(value,weight,N));
//    }
//}

//record ListFormatClass(int value,int weight,double ratio){
//    public ListFormatClass(int value,int weight){this(value,weight,(double)value/(double) weight);}
//}
//public class FractionalKnapsack{
//    public static double calcFractionalKnapsack(int[]value,int []weight,int N){
//        List<ListFormatClass> list = new ArrayList<>();
//        for(int i=0;i<value.length;i++){
//            list.add(new ListFormatClass(value[i],weight[i]));
//        }
//        double maxValue = 0.0;
//        Collections.sort(list,(a,b)->Double.compare(b.ratio(),a.ratio()));
//        for(int i=0;i<list.size();i++){
//            if(N >= list.get(i).weight()){
//                N -= list.get(i).weight();
//                maxValue += list.get(i).value();
//            } else if (N < list.get(i).weight()) {
//                double fraction = (double) N / list.get(i).weight();
//                double money = fraction * list.get(i).value();
//                maxValue += money;
//            }
//        }
//        return maxValue;
//    }
//    public static void main(String[] args){
//        int value[]= {60,100,120};
//        int [] weight = {10,20,30};
//        int N = 50;
//        System.out.println(calcFractionalKnapsack(value,weight,N));
//    }
//}

//record ListFormatClass(int value,int weight,double ratio){
//    public ListFormatClass(int value,int weight){
//        this(value,weight,(double)value/(double)weight);
//    }
//}
//public class FractionalKnapsack{
//    public static double calcFractionalKnapsack(int []value,int []weight){
//        List<ListFormatClass> list = new ArrayList<>();
//        for(int i=0;i<value.length;i++){
//            list.add(new ListFormatClass(value[i],weight[i]));
//        }
//        Collections.sort(list,(a,b)->{
//            list.get(b.ratio());
//        })
//    }
//    public static void main(String[] args){
//        int value[]= {60,100,120};
//        int [] weight = {10,20,30};
//        int N = 50;
//    }
//}


//record ListInputFormat(int value,int weight,double ratio){
//    public ListInputFormat(int value,int weight){
//        this(value,weight,(double)value/(double) weight);
//    }
//}
//public class FractionalKnapsack {
//    public static double calcFractionalKnapsack(int []value,int []weight,int N){
//        List<ListInputFormat> list = new ArrayList<>();
//        for(int i=0;i<value.length;i++) {
//            list.add(new ListInputFormat(value[i], weight[i]));
//        }
//        Collections.sort(list,(a,b)->Double.compare(b.ratio(),a.ratio()));
//        double maxMoney = 0.0;
//        for(int i=0;i<list.size();i++){
//            if(N==0)
//                break;
//            if(N>=list.get(i).weight()){
//                N -= list.get(i).weight();
//                maxMoney += list.get(i).value();
//            } else if (N<list.get(i).weight()) {
//                double fraction = (double) N / (double) list.get(i).weight();
//                double money = fraction * list.get(i).value();
//                maxMoney += money;
//                N=0;
//            }
//        }
//        return maxMoney;
//    }
//    public static void main(String[] args){
//        int value[]= {60,100,120};
//        int [] weight = {10,20,30};
//        int N = 50;
//        System.out.println(calcFractionalKnapsack(value,weight,N));
//    }
//}
//
record ListInputFormat(int value,int weight,double ratio){
    public ListInputFormat(int value,int weight){
        this(value,weight,(double)value/(double) weight);
    }
}
public class FractionalKnapsack {
    public static double calcFractionalKnapsack(int []value,int []weight,int N){
        List<ListInputFormat> list = new ArrayList<>();
        for(int i=0;i<value.length;i++){
            list.add(new ListInputFormat(value[i],weight[i]));
        }
        Collections.sort(list,(a,b)->Double.compare(b.ratio(),a.ratio()));
        double maxMoney = 0.0;
        for(int i=0;i<list.size();i++){
            if(N==0)
                break;
            if(N>=list.get(i).weight()){
                N -= list.get(i).weight();
                maxMoney +=list.get(i).value();
            }
            else if(N<list.get(i).weight()){
                double fraction = (double) N / (double) list.get(i).weight();
                double money = fraction * list.get(i).value();
                maxMoney += money;
                N=0;
            }
        }
        return maxMoney;
    }
    public static void main(String[] str){
        int value[]= {60,100,120};
        int [] weight = {10,20,30};
        int N = 50;
        System.out.println(calcFractionalKnapsack(value,weight,N));
    }
}