package Array_Questions;

import java.util.ArrayList;
import java.util.List;

//public class NestedList {
//    public static void main(String[] args){
//
//        List<List<Integer>> list = new ArrayList<>();//Nested List
//
//        List<Integer> list1 = new ArrayList<>();//Row 1 List
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new ArrayList<>();//Row 2 List
//        list2.add(3);
//        list2.add(4);
//
//        list.add(list1); //Add list1 in list
//        list.add(list2); //Add list2 in list
//
//        System.out.print(list);
//    }
//}

//public class NestedList {
//    public static void main(String[] args){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//        list.add(list1);
//        list.add(list2);
//        System.out.println(list);
//    }
//}
//
//public class NestedList {
//    public static void main(String[] args){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//        list.add(list1);
//        list.add(list2);
//        System.out.println(list);
//    }
//}

//public class NestedList {
//    public static void main(String[] args){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list2.add(3);
//        list2.add(4);
//        list.add(list1);
//        list.add(list2);
//        System.out.println(list);
//    }
//}

public class NestedList {
    public static void main(String []args){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list.add(list1);
        list.add(list2);
        System.out.println(list);
    }
}