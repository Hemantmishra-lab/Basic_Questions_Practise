//    package Array_Questions;
//
//    import java.util.HashSet;
//    import java.util.Scanner;
//    import java.util.Set;
//
//    public class RemoveDuplicates {
//
//        public static void main(String[] args){
//            Set<Integer> set = new HashSet<>();
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int arr[] = new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            for(int i=0;i<arr.length;i++){
//                set.add(arr[i]);
//            }
//            System.out.println(set);
//        }
//    }


package Array_Questions;

import java.sql.Array;
import java.util.*;

//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number of elements: ");
//        int count = scanner.nextInt();
//
//        // Using a Set to automatically handle uniqueness
//        Set<Integer> uniqueNumbers = new HashSet<>();
//
//        System.out.println("Enter " + count + " numbers:");
//        for (int i = 0; i < count; i++) {
//            // We can add directly to the set without an intermediate array
//            // unless you need the original array for something else.
//            uniqueNumbers.add(scanner.nextInt());
//        }
//
//        System.out.println("Unique Elements: " + uniqueNumbers);
//
//        scanner.close();
//    }
//}

//public class RemoveDuplicates{
//    public static void calcRemoveDuplicates(int []arr){
//        Set<Integer> uniqueElements = new HashSet<>();
//        for(int X : arr){
//            uniqueElements.add(X);
//        }
//        System.out.println(uniqueElements);
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,10,100};
//        calcRemoveDuplicates(arr);
//    }
//}

//public class RemoveDuplicates{
//    public static List<Integer> calcRemoveDuplicates(int arr[]){
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(!list.contains(arr[i])){
//                list.add(arr[i]);
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,10,30};
//        System.out.println(calcRemoveDuplicates(arr));
//    }
//}

//public class RemoveDuplicates{
//    public static List<Integer> calcRemoveDuplicates(int []arr){
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(!list.contains(arr[i]))
//                list.add(arr[i]);
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,20,30,10};
//        System.out.print(calcRemoveDuplicates(arr));
//    }
//}

public class RemoveDuplicates {
    public static List<Integer> calcRemoveDuplicates(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int X:arr)
            map.put(X,map.getOrDefault(X,0)+1);
        for(int Key:map.keySet()){
            if(map.get(Key)==1){
                list.add(Key);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int []arr = {1,8,5,4,6,6,7,2};
        System.out.println(calcRemoveDuplicates(arr));
    }
}

