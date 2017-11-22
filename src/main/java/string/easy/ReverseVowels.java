package string.easy;

public class ReverseVowels {
    public static String reverseVowels(String s) {

        StringBuffer sb = new StringBuffer();
        int j =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A'){
                sb.append(s.charAt(i));
            }else if (s.charAt(i)=='e'|| s.charAt(i)=='E'){
                sb.append(s.charAt(i));
            }else if (s.charAt(i)=='i' || s.charAt(i)=='I'){
                sb.append(s.charAt(i));
            }else if (s.charAt(i)=='o' || s.charAt(i)=='O'){
                sb.append(s.charAt(i));
            }else if (s.charAt(i)=='u' || s.charAt(i)=='U'){
                sb.append(s.charAt(i));
            }


        }

        sb.reverse();
        String ss = new String(sb);
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='a' || s.charAt(i)=='A'){
               c[i]=ss.charAt(j++);
           }else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
               c[i]=ss.charAt(j++);
           }else if(s.charAt(i)=='i' || s.charAt(i)=='I'){
               c[i]=ss.charAt(j++);
           }else if(s.charAt(i)=='o' || s.charAt(i)=='O'){
               c[i]=ss.charAt(j++);
           }else if(s.charAt(i)=='u' || s.charAt(i)=='U'){
               c[i]=ss.charAt(j++);
           }

        }



        return new String(c);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String ss = reverseVowels(s);

        System.out.println(ss);

    }
}
