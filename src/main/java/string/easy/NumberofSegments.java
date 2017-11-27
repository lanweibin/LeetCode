package string.easy;

//434. Number of Segments in a String
public class NumberofSegments {
    public static int countSegments(String s) {
      int count = 0;
        for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ') ){
                 count++;
             }

        }

        return count;
    }

    public static void main(String[] args) {
        String s = "helo";
        int n = countSegments(s);

        System.out.println(n);
    }
}
