package Array_Questions;

import java.util.HashMap;
import java.util.Map;
public class SymmetricPairs {
    public static void calcSymmetricPairs(int [][]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean isSymmetry  = false;
        for(int[] X:arr){
            int first = X[0];
            int second = X[1];

            if(map.containsKey(second) && map.get(second)==first){
                isSymmetry = true;
                System.out.println("Symmetric "+isSymmetry+" "+second+" "+map.get(second));
            }
            else{
                map.put(first,second);
            }
        }
       if(!isSymmetry)
           System.out.println("NoSymmetric found");

    }
    public static void main(String[] args){
        int[][] arr = {
                {11, 20},
                {30, 40},
                {5, 10},
                {40, 30},
                {10, 5}
        };
        calcSymmetricPairs(arr);
    }
}

