package Array_Questions;

public class SearchAElement {
    public static boolean calcSearchAElement(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        int []arr = {1090,7,9,2,4};
        int target = 4;
        System.out.print(calcSearchAElement(arr,target));
    }
}
