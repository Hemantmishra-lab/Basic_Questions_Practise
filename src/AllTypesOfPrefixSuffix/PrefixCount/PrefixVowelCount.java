package AllTypesOfPrefixSuffix.PrefixCount;

public class PrefixVowelCount {

    public static int[] calcPrefixVowelCount(String str) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = str.length();

        // Prefix Vowel Count store karega
        int[] prefixVowel = new int[n];

        // Pehla character check karo
        char ch = Character.toLowerCase(str.charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            prefixVowel[0] = 1;
        }

        // Prefix Count Build
        for (int i = 1; i < n; i++) {

            // Previous count copy karo
            prefixVowel[i] = prefixVowel[i - 1];

            ch = Character.toLowerCase(str.charAt(i));

            // Agar vowel hai to count increase karo
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                prefixVowel[i]++;
            }
        }

        return prefixVowel;
    }

    public static void main(String[] args) {

        String str = "education";

        int[] prefixVowel = calcPrefixVowelCount(str);

        System.out.print("Prefix Vowel Count = ");

        for (int count : prefixVowel) {
            System.out.print(count + " ");
        }
    }
}