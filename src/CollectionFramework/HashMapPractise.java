package CollectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;

//public class HashMapPractise {
//    public static void main(String[] args){
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"Ram");
//        map.put(2,"Shyam");
//        map.put(3,"Ramu");
//        for(Integer x : map.keySet())
//            System.out.println(x+" "+map.get(x));
//    }
//}

//public class HashMapPractise {
//    public static void calcFreq(String []str){
//        HashMap<String,Integer> map = new HashMap<>();
//        for(int i=0;i<str.length;i++){
//            map.put(str[i],map.getOrDefault(str[i],0)+1);
//        }
//        System.out.println(map);
//    }
//    public static void main(String[] args){
//        String [] str = {"Ram","Ram","Shyam","Vaibhav","Sonu","Sonu"};
//       calcFreq(str);
//    }
//}

public class HashMapPractise {
    public static void calcFrequency(String[] str){
        HashMap<Character, Integer> map = new HashMap<>();
        String word = str[0];
        char[] chars = word.toCharArray();
        for(char X:chars){
            map.put(X,map.getOrDefault(X,0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args){
        String []str = {"RAMA"};
        calcFrequency(str);
    }
}
