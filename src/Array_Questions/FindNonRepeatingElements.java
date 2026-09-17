package Array_Questions;


import java.util.ArrayList;
import java.util.List;

public class FindNonRepeatingElements {
    public static List<Integer> calcFindNonRepeatingElements(int []arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean hasLeftNeighbour = (i>0 && arr[i]==arr[i-1]);
            boolean hasRightNeighbour = (i<arr.length-1 && arr[i] == arr[i+1]);
            if(!hasRightNeighbour && !hasLeftNeighbour){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int []arr = {1,1,1,2,2,3,3,5,8,9,6,7};
        System.out.println(calcFindNonRepeatingElements(arr));
    }
}
