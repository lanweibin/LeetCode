package string.easy;

/**
 * 459. Repeated Substring Pattern
 */
public class RepeatedSubstring {
    public static boolean repeatedSubstringPattern(String s) {
//        int len = s.length();
//        for (int i = len/2; i >=1; i--) {
//             if( len % i ==0){
//                 int c = len / i;
//                 String str = "";
//                 for (int j = 1; j <= c; j++) {
//                      str += s.substring(0,i);
//                     }
//                     if(str.equals(s)){
//                     return true;
//                 }
//             }
//
//        }
//        return false;

        int len = s.length();
        for (int i = len/2; i >= 1; i--) {
             if(len % i == 0){
                 int time = len / i;
                 String str = s.substring(0,i);
                 StringBuilder sb  = new StringBuilder();
                 for (int j = 1; j <=time; j++) {
                      sb.append(str);

                 }
                 if (sb.toString().equals(s)){
                     return  true;
                 }
             }

        }

        return false;

    }

    public  static void main(String[] args) {
        String s = "abab";

       boolean b= repeatedSubstringPattern(s);

        System.out.println(b);
    }
}
