package string.easy;

//58. Length of Last Word
public class LastWord {
    public int lengthOfLastWord(String s ){
       String[] s1 =  s.split(" ");
       StringBuilder sb = new StringBuilder();

        for (int i = s1.length - 1; i >= 0; i++) {
            sb.append(s1[i]);
            break;

        }
        String re = "";
        re = sb.toString();
        char[] c = re.toCharArray();
        int n = c.length;

        return n;
    }
}
