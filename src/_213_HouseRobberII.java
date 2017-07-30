/**
 * Created by Eakon on 2017/7/30.
 */
public class _213_HouseRobberII {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }

    private int rob(int[] nums, int low, int high){
        int n=high-low+1;
        int[] dp = new int[n];
        dp[n-1]=nums[high];
        for(int i=n-2; i>=0; i--){
            for(int j=i; j<n; j++){
                dp[i]=Math.max(dp[i],nums[j+low]+(j+2<n?dp[j+2]:0));
            }
        }
        return dp[0];
    }
}
