package String_Questions;
import java.util.Scanner;

public class RemoveDigitFromNumbertoMaximizeResult {
    public static String removeDigit(String number, char digit) {
        int lastIndex = -1;
        int n = number.length();

        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                lastIndex = i; // Track the last time we see the digit

                // If removing this digit makes the next digit move to a higher place value
                // and the next digit is larger, we found our optimal removal.
                if (i + 1 < n && number.charAt(i + 1) > digit) {
                    return number.substring(0, i) + number.substring(i + 1);
                }
            }
        }

        // If we didn't find an "increasing" case, remove the very last occurrence.
        return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char digit = sc.nextLine().charAt(0);
        System.out.println(removeDigit(number, digit));
    }
}
