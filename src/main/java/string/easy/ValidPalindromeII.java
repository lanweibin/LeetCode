package string.easy;

//680. Valid Palindrome II
public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        StringBuilder before = new StringBuilder();
        String  after = null;
        String  sb = null;

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c.length; j++) {
                if (i!=j){
                  before.append(c[j]);
                }

            }
            sb = before.toString();
            after = before.reverse().toString();
            if (sb.equals(after)){
                return true;
            }
            before.delete(0,before.length());
            sb = null;
            after = null;


        }

        return false;
    }

    public static void main(String[] args) {
        String s = "aba";
        boolean b = validPalindrome(s);

        System.out.println(b);
    }
}
