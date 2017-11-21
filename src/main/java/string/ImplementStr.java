package string;

//28. Implement strStr()
public class ImplementStr {
    public static int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
           int a  =  haystack.indexOf(needle);
           return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello";
        String ss = "ll";

        int n = strStr(s,ss);

        System.out.println(n);
    }
}
