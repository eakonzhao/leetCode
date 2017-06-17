/**
 * Created by Eakon on 2017/6/17.
 */
public class _5_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if(s==null || s.length()<2) return s;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        char[] w = s.toCharArray();
        int maxLen = 0;
        String maxSub = null;

        dp[length-1][length-1] = true;
        for(int i=length-2; i>=0; i--){//试每一个起点
            int maxJ = i;
            for(int j = i+1; j<length; j++){//每一个终点
                if(w[i]==w[j] && (j-i<3 || dp[i+1][j-1])){
                    dp[i][j]=true;
                    maxJ=j;
                }else{
                    dp[i][j]=false;
                }
            }
            if(maxJ-i+1>maxLen){
                maxLen = maxJ-i+1;
                maxSub = s.substring(i,maxJ+1);
            }
        }
        return maxSub;
    }
}
