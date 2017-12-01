package string.medium;

//583. Delete Operation for Two Strings
public class DeleteOperation {
    public static int minDistance(String word1, String word2) {
        int i = 0, j = 0, count = 0;

        while (i<=word1.length()-1){
            if (word1.charAt(i) != word2.charAt(j)){
                count++;
                j++;
            }else {
                i++;
                j++;
            }
        }
        if (j <= word2.length()-1){
            j++;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "aaq";
        String s2 = "eaat";

        int n = minDistance(s1,s2);
        System.out.println(n);
    }
}
