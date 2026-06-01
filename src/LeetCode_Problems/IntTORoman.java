package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

class ValueAndSymbol {
    String symbol;
    int value;
    public ValueAndSymbol(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }
}

public class IntTORoman {
        public static String calcIntTORoman(int num) {
            List<ValueAndSymbol> list = new ArrayList<>();
            list.add(new ValueAndSymbol("M", 1000));
            list.add(new ValueAndSymbol("CM", 900));
            list.add(new ValueAndSymbol("D", 500));
            list.add(new ValueAndSymbol("CD", 400));
            list.add(new ValueAndSymbol("C", 100));
            list.add(new ValueAndSymbol("XC", 90));
            list.add(new ValueAndSymbol("L", 50));
            list.add(new ValueAndSymbol("XL", 40));
            list.add(new ValueAndSymbol("X", 10));
            list.add(new ValueAndSymbol("IX", 9));
            list.add(new ValueAndSymbol("V", 5));
            list.add(new ValueAndSymbol("IV", 4));
            list.add(new ValueAndSymbol("I", 1));

            int n = list.size();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int curr = list.get(i).value;
                while (num >= curr) {
                    num -= curr;
                    str.append(list.get(i).symbol);
                }
            }
            return str.toString();
        }

    public static void main(String[] args) {
        int num = 772;
        System.out.println(calcIntTORoman(num)); // Output: DCCLXXII
    }
}
