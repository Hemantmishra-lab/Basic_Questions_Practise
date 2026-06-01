package CollectionFramework;

import java.util.*;

public class CollectionConversionsDemo {

    public static void main(String[] args) {

        // 1. Array -> List
        System.out.println("1. Array -> List");
        String[] arr1 = {"Java", "Spring", "SQL"};
        List<String> list1 = Arrays.asList(arr1);
        System.out.println(list1);

        // 2. List -> Array
        System.out.println("\n2. List -> Array");
        List<Integer> list2 = Arrays.asList(10, 20, 30);
        Integer[] arr2 = list2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));

        // 3. List -> Set
        System.out.println("\n3. List -> Set");
        List<Integer> list3 = Arrays.asList(1,2,2,3,3,4);
        Set<Integer> set3 = new HashSet<>(list3);
        System.out.println(set3);

        // 4. Set -> List
        System.out.println("\n4. Set -> List");
        Set<String> set4 = new HashSet<>(Arrays.asList("A","B","C"));
        List<String> list4 = new ArrayList<>(set4);
        System.out.println(list4);

        // 5. Array -> Set
        System.out.println("\n5. Array -> Set");
        Integer[] arr5 = {1,1,2,2,3,3};
        Set<Integer> set5 = new HashSet<>(Arrays.asList(arr5));
        System.out.println(set5);

        // 6. Set -> Array
        System.out.println("\n6. Set -> Array");
        Integer[] arr6 = set5.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr6));

        // 7. String -> char[]
        System.out.println("\n7. String -> char[]");
        String str7 = "HELLO";
        char[] chars7 = str7.toCharArray();
        System.out.println(Arrays.toString(chars7));

        // 8. char[] -> String
        System.out.println("\n8. char[] -> String");
        char[] chars8 = {'C','O','D','E'};
        String str8 = new String(chars8);
        System.out.println(str8);

        // 9. Map -> Keys
        System.out.println("\n9. Map -> Keys");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Spring");
        map.put(3,"SQL");
        System.out.println(map.keySet());

        // 10. Map -> Values
        System.out.println("\n10. Map -> Values");
        System.out.println(map.values());

        // 11. Queue -> List
        System.out.println("\n11. Queue -> List");
        Queue<Integer> queue11 = new LinkedList<>();
        queue11.add(10);
        queue11.add(20);
        queue11.add(30);
        List<Integer> list11 = new ArrayList<>(queue11);
        System.out.println(list11);

        // 12. List -> Queue
        System.out.println("\n12. List -> Queue");
        List<Integer> list12 = Arrays.asList(10,20,30);
        Queue<Integer> queue12 = new LinkedList<>(list12);
        System.out.println(queue12);

        // 13. int[] -> List<Integer>
        System.out.println("\n13. int[] -> List<Integer>");
        int[] arr13 = {5,10,15};
        List<Integer> list13 = new ArrayList<>();
        for(int num : arr13){
            list13.add(num);
        }
        System.out.println(list13);

        // 14. List<Integer> -> int[]
        System.out.println("\n14. List<Integer> -> int[]");
        List<Integer> list14 = Arrays.asList(100,200,300);
        int[] arr14 = list14.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arr14));

        // 15. Remove Duplicates from Array
        System.out.println("\n15. Remove Duplicates");
        Integer[] arr15 = {1,1,2,2,3,3,4};
        Set<Integer> set15 = new LinkedHashSet<>(Arrays.asList(arr15));
        System.out.println(set15);

        // 16. Unique Characters
        System.out.println("\n16. Unique Characters");
        String str16 = "programming";
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for(char ch : str16.toCharArray()){
            uniqueChars.add(ch);
        }
        System.out.println(uniqueChars);

        // 17. Frequency Count
        System.out.println("\n17. Frequency Count");
        int[] arr17 = {1,2,2,3,3,3};
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : arr17){
            freqMap.put(num,
                    freqMap.getOrDefault(num,0)+1);
        }
        System.out.println(freqMap);

        // 18. Intersection of Arrays
        System.out.println("\n18. Intersection");
        Set<Integer> inter1 =
                new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> inter2 =
                new HashSet<>(Arrays.asList(3,4,5,6));

        inter1.retainAll(inter2);
        System.out.println(inter1);

        // 19. Union of Arrays
        System.out.println("\n19. Union");
        Set<Integer> union =
                new HashSet<>(Arrays.asList(1,2,3));
        union.addAll(Arrays.asList(3,4,5));
        System.out.println(union);

        // 20. Reverse String
        System.out.println("\n20. Reverse String");

        String str20 = "hello";

        List<Character> chars20 = new ArrayList<>();

        for(char ch : str20.toCharArray()){
            chars20.add(ch);
        }

        Collections.reverse(chars20);

        StringBuilder sb = new StringBuilder();

        for(char ch : chars20){
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
