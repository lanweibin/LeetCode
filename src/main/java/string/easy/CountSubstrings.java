package string.easy;

//696. Count Binary Substrings
public class CountSubstrings {
    public static int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)){
                count += Math.min(pre,cur);
                pre = cur;
                cur = 1;
            }else {
                cur ++;
            }

        }

        return count + Math.min(pre,cur);
    }

    public static  int count(String s ){
        int pre = 0,cur =1,res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                cur++;
            } else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "00110011";
        int n = countBinarySubstrings(s);
        int b = count(s);

        System.out.println(n);
        System.out.println(b);
    }
}
