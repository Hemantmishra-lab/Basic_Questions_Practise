package Pointers.SlidingWindow.VariableWindow;

//public class LongestSubstring {
//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int maxLength = 0;
//
//        // Character frequency track karne ke liye ASCII array
//        int[] charCount = new int[128];
//
//        // Aapka bataya hua Variable Sliding Window format
//        int left = 0;
//        for (int right = 0; right < n; right++) {
//            char rightChar = s.charAt(right);
//            charCount[rightChar]++; // Window ko expand kiya aur character count badhaya
//
//            // CONDITION: Agar koi character repeat ho raha hai (count > 1)
//            // Toh left pointer se window ko shrink (chota) karo
//            while (charCount[rightChar] > 1) {
//                char leftChar = s.charAt(left);
//                charCount[leftChar]--; // Left character ka count gatao
//                left++;                // Window shrink ho gayi
//            }
//
//            // Valid window milne par max length update karo
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        String s = "abcabcbb";
//
//        // Output Process
//        int result = lengthOfLongestSubstring(s);
//        System.out.println(result); // Output: 3
//    }
//}

//public class LongestSubstring {
//    public static int calcLongestSubString(String s){
//        int maxLen = 0;
//        int []charCount = new int[128];
//        int left = 0;
//        for(int right = 0;right<s.length();right++){
//            charCount[s.charAt(right)]++;
//            while(charCount[s.charAt(right)]>=2){
//                charCount[s.charAt(left)]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "abcabcbb";
//        System.out.println(calcLongestSubString(s));
//    }
//}

//public class LongestSubstring {
//    public static int calcLongestSubString(String s){
//        int maxLen = 0;
//        int []charCount = new int[128];
//        int left = 0;
//        for(int right = 0;right<s.length();right++){
//            charCount[s.charAt(right)]++;
//            while(charCount[s.charAt(right)]>=2){
//                charCount[s.charAt(left)]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "abcabcbb";
//        System.out.println(calcLongestSubString(s));
//    }
//}
//public class LongestSubstring {
//    public static int calcLongestSubstring(String s){
//        int maxLen = 0;
//        int []charCount  = new int[128];
//        int left = 0;
//        for(int right = 0;right<s.length();right++){
//            char rightchar = s.charAt(right);
//            charCount[rightchar]++;
//            while (charCount[rightchar]>=2){
//                char charLeft = s.charAt(left);
//                charCount[charLeft]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "abcabcbb";
//        System.out.println(calcLongestSubstring(s));
//    }
//}
//
//public class LongestSubstring {
//    public static int calcLongestSubString(String s){
//        int []arr = new int[128];
//        int maxLen = 0;
//        int left = 0;
//        for(int right = 0;right<s.length();right++){
//            char rightChar = s.charAt(right);
//            arr[rightChar]++;
//            while(arr[rightChar]>=2){
//                char charLeft = s.charAt(left);
//                arr[charLeft]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "abcabcbb";
//        System.out.println(calcLongestSubString(s));
//    }
//}

//public class LongestSubstring {
//    public static int caclLongestSubstring(String s){
//        int []arr = new int[128];
//        int index = 0;
//        int left = 0;int maxLen = 0;
//        for(int right = 0;right<s.length();right++){
//            char charRight = s.charAt(right);
//            arr[charRight]++;
//            while (arr[charRight]>=2){
//                char charLeft = s.charAt(left);
//                arr[charLeft]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "abcabcbb";
//        System.out.println(caclLongestSubstring(s));
//    }
//}

