package Array_Questions;

import java.util.*;

//public class MaxAndMin {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max) max = arr[i];
//            if(arr[i]<min) min = arr[i];
//        }
//        System.out.println(max);
//        System.out.println(min);
//    }
//}

//public class MaxAndMin{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int Max = arr[0];
//        int Min = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max) Max = arr[i];
//            if(arr[i]<Min) Min = arr[i];
//        }
//        System.out.println(Max +" "+ Min);
//    }
//}

//public class MaxAndMin{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int Max = arr[0];
//        int Min = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max) Max = arr[i];
//            if(arr[i]<Min) Min = arr[i];
//        }
//        System.out.println(Max +" " +Min);
//    }
//}


//public class MaxAndMin{
//    public static void maxmin(int []arr){
//        int Max = arr[0],Min = arr[0];
//        int n = arr.length;
//        for(int i=1;i<n;i++){
//            if(Max < arr[i]) Max = arr[i];
//            if(Min >arr[i]) Min = arr[i];
//        }
//        System.out.println(Max + " " +Min);
//    }
//    public static void main(String[] args){
//        int []arr = {102,100,9,1};
//        maxmin(arr);
//    }
//}


//Max ko Integer.MIN_VALUE (sabse chhota number) se start karein.
// Min ko Integer.MAX_VALUE (sabse bada number) se start karein.

//public class MaxAndMin{
//    public static int[] clacMaxAndMin(int []arr){
//        int Max = Integer.MIN_VALUE,Min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max) Max = arr[i];
//            if(arr[i]<Min) Min = arr[i];
//        }
//        int []result = {Max,Min};
//        return result;
//    }
//    public static void main(String[] args){
//        int []arr = {102,100,9,1};
//        int[] result = clacMaxAndMin(arr);
//        for(int x : result){
//            System.out.print(x +" ");
//        }
//    }
//}

//public class MaxAndMin {
//    public static int[] calcMaxAndMin(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int Min = Integer.MAX_VALUE;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max)
//                Max = arr[i];
//            else if(arr[i]<Min)
//                Min = arr[i];
//        }
//        int temp[] = {Max,Min};
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr =  {102,100,9,1};
//        int []temp = calcMaxAndMin(arr);
//        for(int X:temp)
//            System.out.print(X +" ");
//    }
//}
//
//public class MaxAndMin {
//    public static int[] calcMaxAndMin(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int Min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max)
//                Max = arr[i];
//            else if (arr[i]<Min) {
//                Min = arr[i];
//            }
//        }
//        int temp[] = {Max,Min};
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {102,100,9,1};
//        int []temp = calcMaxAndMin(arr);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

//public class MaxAndMin {
//    public static void calcMaxAndMin(int []arr){
//        Arrays.sort(arr);
//        for(int X:arr)
//            System.out.print(X+" ");
//        System.out.println();
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[arr.length-i-1] +" ");
//        }
//    }
//    public static void main(String[] args){
//        int[]arr = {1,3,8,23,8};
//        calcMaxAndMin(arr);
//    }
//}

//public class MaxAndMin {
//    public static List<List<Integer>> calcMaxAndMin(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            list1.add(arr[i]);
//            list2.add(arr[i]);
//        }
//        Collections.sort(list1,(a,b)->Integer.compare(b,a));
//        Collections.sort(list2);
//        list.add(list1);
//        list.add(list2);
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr ={1,3,2,7,54};
//        System.out.println(calcMaxAndMin(arr));
//    }
//}

//public class MaxAndMin {
//    public static int[] calcMaxAndMin(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int Min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                Max = arr[i];
//            }
//            if(arr[i]<Min){
//                Min = arr[i];
//            }
//        }
//        return new int[]{Max,Min};
//    }
//    public static void main(String[] args){
//        int []arr = {1,3,2,7,54};
//        int []temp= calcMaxAndMin(arr);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

//public class MaxAndMin {
//    public static List<List<Integer>> calcMaxAndMin(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for(int X:arr){
//            list1.add(X);
//            list2.add(X);
//        }
//        Collections.sort(list1,(a,b)->Integer.compare(b,a));
//        Collections.sort(list2);
//        list.add(list1);
//        list.add(list2);
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,3,2,7,54};
//        System.out.println(calcMaxAndMin(arr));
//    }
//}

public class MaxAndMin {
    public static void calcMaxAndMin(int arr[]){
       Arrays.sort(arr);
       for(int X:arr) {
           System.out.print(X + " ");
       }
        System.out.println();
       for(int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        int []arr = {1,3,2,7,54};
        calcMaxAndMin(arr);
    }
}