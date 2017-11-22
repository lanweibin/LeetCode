package string.easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        char[] c = ss.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(c[i]>='a' && c[i]<='z'){
                sb.append(c[i]);
            }
            if(c[i]>='0' && c[i]<='9'){
                sb.append(c[i]);
            }

        }
        String allchar = sb.toString();
        String resvers = sb.reverse().toString();

        if (allchar.equals(resvers)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "0p";

        boolean b = isPalindrome(s);

        System.out.println(b);
    }
}
