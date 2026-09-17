package Array_Questions;

import java.util.HashMap;

public class CountSubSumArray{
    public static int calcCountSubSumArray(int []arr,int n){
        int count = 0,prefix = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int X:arr){
            prefix += X;
            if(map.containsKey(prefix-n)){
               count = count + map.get(prefix-n);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[]args){
        int []arr = {1,2,1,2,1};
        int n = 3;
        System.out.println(calcCountSubSumArray(arr,n));
    }
}