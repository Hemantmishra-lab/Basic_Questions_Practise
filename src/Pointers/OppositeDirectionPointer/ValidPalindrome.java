package Pointers.OppositeDirectionPointer;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Aapka bataya hua Two Pointer format
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Agar dono characters match nahi karte, toh palindrome nahi hai
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // Match hone par dono pointers ko center ki taraf lao
            left++;
            right--;
        }

        return true; // Agar loop bina kisi mismatch ke khatam ho gaya
    }

    public static void main(String[] args) {
        // Input Format
        String s = "madam";

        // Output Process
        boolean result = isPalindrome(s);
        System.out.println(result); // Output: true
    }
}

