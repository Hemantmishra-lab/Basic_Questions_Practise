package Pointers.SlidingWindow.VariableWindow;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Character frequency track karne ke liye ASCII array
        int[] charCount = new int[128];

        // Aapka bataya hua Variable Sliding Window format
        int left = 0;
        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            charCount[rightChar]++; // Window ko expand kiya aur character count badhaya

            // CONDITION: Agar koi character repeat ho raha hai (count > 1)
            // Toh left pointer se window ko shrink (chota) karo
            while (charCount[rightChar] > 1) {
                char leftChar = s.charAt(left);
                charCount[leftChar]--; // Left character ka count gatao
                left++;                // Window shrink ho gayi
            }

            // Valid window milne par max length update karo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Input Format
        String s = "abcabcbb";

        // Output Process
        int result = lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }
}

