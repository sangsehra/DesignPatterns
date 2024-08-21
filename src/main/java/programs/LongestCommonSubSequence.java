package programs;

import java.util.Arrays;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
       int n= longestCommonSubsequence("abcd","abcd");
        System.out.println(n);
    }
        public static int longestCommonSubsequence(String text1, String text2) {
            int dp[][] = new int[text1.length()][text2.length()];
            Arrays.stream(dp).forEach(row->Arrays.fill(row,-1));
            System.out.println(Arrays.deepToString(dp));
            return longCommonSubSequence(text1,text2,text1.length()-1,text2.length()-1,dp);
        }

        public static int longCommonSubSequence(String text1, String text2, int ind1, int ind2, int dp[][]){
            if(ind1 <0 || ind2<0){
                return 0;
            }
            if (dp[ind1][ind2]!=-1){
                return dp[ind1][ind2];
            }else {
                if (text1.charAt(ind1) == text2.charAt(ind2)) {
                    int maxLength = 1 + longCommonSubSequence(text1, text2, ind1 - 1, ind2 - 1, dp);
                    dp[ind1][ind2]=maxLength;
                    return maxLength;
                }
            }

            return Math.max(longCommonSubSequence(text1,text2,ind1,ind2-1,dp),longCommonSubSequence(text1,text2,ind1-1,ind2,dp));
        }

}
