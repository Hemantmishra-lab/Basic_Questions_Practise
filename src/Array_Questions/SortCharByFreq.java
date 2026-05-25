package Array_Questions;

import java.util.HashMap;

import java.util.*;

public class SortCharByFreq {
    public static String calcSortCharByFreq(String str) {
        if (str == null || str.length() <= 1) return str;

        // 1. Frequency Map banana (Galti theek ki: str.toCharArray())
        HashMap<Character, Integer> map = new HashMap<>();
        for (char X : str.toCharArray()) {
            map.put(X, map.getOrDefault(X, 0) + 1);
        }

        // 2. Max-Heap banana character frequency ke hisab se
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        // 3. String vapas taiyar karna (StringBuilder fast hota hai)
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int count = map.get(current); // Check karenge woh char kitni baar aaya tha

            // Jitni frequency hai, utni baar character ko jodenge
            for (int i = 0; i < count; i++) {
                result.append(current);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "tree";
        System.out.println("Original: " + str);
        System.out.println("Sorted by Freq: " + calcSortCharByFreq(str));
        // Output: "eert" ya "eetr"
    }
}
