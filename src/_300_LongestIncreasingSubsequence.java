import java.util.Arrays;

/**
 * Created by Eakon on 2017/8/1.
 */
public class _300_LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int res=1;
        for(int i=0; i<dp.length; i++) res = Math.max(res,dp[i]);
        return res;
    }
}
