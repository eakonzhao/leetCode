/**
 * Created by Eakon on 2017/7/30.
 */
public class _91_DecodeWays {
    public static int numDecodings(String s) {
        if(s==null||s.length()==0) return 0;
        int n=s.length();
        int[] dp = new int[n+1];
        dp[n]=1;
        dp[n-1]=s.charAt(n-1)=='0'?0:1;
        for(int i=n-2; i>=0; i--){
            if(s.charAt(i)=='0') continue;
            else dp[i]=Integer.valueOf(s.substring(i,i+2))<=26?dp[i+1]+dp[i+2]:dp[i+1];
        }
        return dp[0];
    }
}
