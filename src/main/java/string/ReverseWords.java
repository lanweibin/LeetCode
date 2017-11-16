package string;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");

        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length()-1; j >= 0; j--) {
                sb.append(s1[i].charAt(j));

            }
            sb.append(" ");


        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String result = reverseWords(s);

        System.out.println(result);
    }
}
