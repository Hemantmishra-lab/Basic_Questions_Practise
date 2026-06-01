package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseConversion {
    static void main() {

        System.out.println("1. Array -> List");
        String []str1 = {"a","b","c"};
        List<String> list = new ArrayList<>(Arrays.asList(str1));
        System.out.println(list);

        System.out.println("2.Array -> List");
        int []arr2 = {10,20,30};
        List<Integer> list2 = new ArrayList<>();
        for(int X:arr2)
            list2.add(X);
        System.out.println(list2);

        System.out.println("3.List -> Array");
        List<Integer> list3 = Arrays.asList(1,2,3);
        Integer []arr3 = list3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));

        System.out.println("4.List -> Array");
        List<String> list4 = Arrays.asList("a","b","c");
        String []str4 = list4.toArray(new String[0]);
        System.out.println(Arrays.asList(str4));

        System.out.println("5. Array -> Set");

    }
}
