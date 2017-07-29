/**
 * Created by Eakon on 2017/7/29.
 */
public class _343_IntegerBreak {
    public int integerBreak(int n) {
       int[] dp = new int[n + 1];
        dp[1]=1;
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                dp[i]=max3(dp[i],j*(i-j),j*dp[i-j]);
            }
        }
        return dp[n];
    }

    private int max3(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
}
