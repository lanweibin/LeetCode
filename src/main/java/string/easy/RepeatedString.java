package string.easy;

/**
 * 686. Repeated String Match
 * 让你求最少重复A多少次，才能在使得B是A的子串；如果不能，输出-1
 */
public class RepeatedString {
    public static int repeatedStringMatch(String a, String b){
        int count = 0 ;

       StringBuilder sb = new StringBuilder();
       while (sb.length() < b.length()){
           sb.append(a);
           count++;
       }
       if(sb.toString().contains(b)){
           return count;
       }
       if(sb.append(a).toString().contains(b)){
           return count++;
       }

       return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";

        int n  =  repeatedStringMatch(a,b);

        System.out.println(n);
    }
}
