package LeetCode_Problems;

import java.util.HashMap;
//
//public class RomanToInt {
//    public static int calcRomanToInt(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//        int total = 0;int n = s.length();
//        for(int i=0;i<n;i++){
//            int current = map.get(s.charAt(i));
//            if(i<n-1 && current<map.get(s.charAt(i+1))){
//                total -= current;
//            }
//            else {
//                total += current;
//            }
//        }
//        return total;
//    }
//    public static void main(String[] args){
//        String s = "XVI";
//        System.out.println(calcRomanToInt(s));
//    }
//}


public class RomanToInt {
    public static int calcRomanToInt(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total = 0;int n = s.length();
        for(int i=0;i<n;i++){
            int curr = map.get(s.charAt(i));
            if(i<n-1 && curr < map.get(s.charAt(i+1))){
                total -= curr;
            }
            else {
                total += curr;
            }
        }
        return total;
    }
    public static void main(String[] args){
        String s = "XVL";
        System.out.println(calcRomanToInt(s));
    }
}