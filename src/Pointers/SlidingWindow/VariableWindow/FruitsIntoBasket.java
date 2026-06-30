package Pointers.SlidingWindow.VariableWindow;
import java.util.HashMap;

//public class FruitsIntoBasket {
//    public static int totalFruit(int[] fruits) {
//        // Fruits ki frequency store karne ke liye map
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int maxLength = 0;
//        int n = fruits.length;
//
//        // Aapka bataya hua Variable Sliding Window format
//        int left = 0;
//        for (int right = 0; right < n; right++) {
//            // Window expand karo aur current fruit ka count badhao
//            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
//
//            // CONDITION: Agar basket 2 se zyada ho gayi (Unique fruits > 2)
//            while (map.size() > 2) {
//                int leftFruit = fruits[left];
//                map.put(leftFruit, map.get(leftFruit) - 1); // Frequency kam karo
//
//                // Agar count 0 ho gaya toh basket se nikal do
//                if (map.get(leftFruit) == 0) {
//                    map.remove(leftFruit);
//                }
//                left++; // Window shrink ho gayi
//            }
//
//            // Valid window milne par max fruits update karo
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] fruits = {1, 2, 1};
//
//        // Output Process
//        int result = totalFruit(fruits);
//        System.out.println(result); // Output: 3
//    }
//}

//public class FruitsIntoBasket {
//    public static int calcFruitsIntoBasket(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int maxLen = 0;int left = 0;
//        for(int right = 0;right<arr.length;right++){
//            map.put(arr[right],map.getOrDefault(arr[right],0)+1 );
//            while(map.size()>2){
//               map.put(arr[left],map.get(arr[left])-1);
//               if(map.get(arr[left])==0){
//                   map.remove(arr[left]);
//               }
//               left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        int[] fruits = {1, 2, 1};
//        System.out.println(calcFruitsIntoBasket(fruits));
//    }
//}

//public class FruitsIntoBasket {
//    public static int calcFruitsIntoBasket(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int left = 0;int maxLen = 0;
//        for(int right = 0;right<arr.length;right++){
//            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
//            while(map.size()>2){
//                map.put(arr[left],map.get(arr[left]-1));
//                if(map.get(arr[left])==0)
//                    map.remove(arr[left]);
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] ags){
//        int[] fruits = {1, 2, 1};
//        System.out.println(calcFruitsIntoBasket(fruits));
//    }
//}

public class FruitsIntoBasket {
    public static int calcFruitsIntoBasket(int []fruits){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = 0;
        int left = 0;
        for(int right = 0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left]-1));
                if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] fruits = {1, 2, 1};
        System.out.println(calcFruitsIntoBasket(fruits));
    }
}