package medium;
public class FirstLast {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers can't be palindromes
        }

        String numStr = Integer.toString(x); // Convert the number to a string
        int n = numStr.length();

        for (int i = 0; i < n / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(n - 1 - i)) {
                return false; // If characters don't match, not a palindrome
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int a = 121;
        boolean result = isPalindrome(a);
        System.out.println(result); // Output: true
    }
}

