package string.medium;

//583. Delete Operation for Two Strings
public class DeleteOperation {
    public static int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                } else if  (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }

        }

        int val =  dp[word1.length()][word2.length()];
        return m+n - 2*val;
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";

        int n = minDistance(s1,s2);
        System.out.println(n);
    }
}
