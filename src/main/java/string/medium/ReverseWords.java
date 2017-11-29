package string.medium;

//151. Reverse Words in a String
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] split = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = split.length-1; i >= 0; i--) {
            sb.append(split[i]);
            sb.append(" ");

        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "   a   b ";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
