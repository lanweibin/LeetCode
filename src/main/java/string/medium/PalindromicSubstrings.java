package string.medium;

import org.junit.Test;

//647. Palindromic Substrings
public  class PalindromicSubstrings {
    int count = 0;

    @Test
    public  int countSubstrings(String s) {
        int count = 0;
        if (s == null || s.length() == 0 ) return 0;
        
        for (int i = 0; i <s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }

        System.out.println(count);
        return count;
    }

    private  void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }


}
