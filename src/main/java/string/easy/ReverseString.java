package string.easy;

public class ReverseString {
    public static String reverseString(String s) {
        char[] c = s.toCharArray();
        int j = 0;
        for (int i = s.length()-1; i>=0; i--) {
            c[j++] = s.charAt(i);

        }
        return  new String(c);
    }

    public static void main(String[] args) {
        String s = "abc";

        System.out.println(reverseString(s));
    }
}
