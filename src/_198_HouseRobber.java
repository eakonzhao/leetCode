/**
 * Created by Eakon on 2017/6/4.
 * https://leetcode.com/problems/house-robber/#/description
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * testcaste:
 *
 * input:
 *  [3,4,1,2]
 *  [4,3,1,2]
 *
 * output:
 *  6[3,(4),1,(2)]
 *  6[(4,)3,1,(2)]
 *
 *  暴力解法:检查所有房子的组合，对每一个组合，检查是否有相邻的房子，如果没有，记录其价值。
 *  找最大值。时间复杂度为 O((2^n)*n)
 */
public class _198_HouseRobber {

    /**
     * 记忆化搜索
     * @param nums
     * @return
     */
    public int rob(int[] nums){
        if(nums==null || nums.length==0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            dp[i]=-1;
        }
        return tryRob(nums,dp,0);
    }

    private int tryRob(int[] nums, int[] dp, int index){
        if(index>=dp.length) return 0;
        if(dp[index]==-1){
            int result= 0;
            for(int i=index; i<dp.length; i++){
               result =  Math.max(nums[i]+tryRob(nums,dp,index+2),result);
            }
            dp[index] = result;
        }
        return dp[index];
    }
    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int rob2(int[] nums){
        if(nums==null||nums.length==0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        // dp[i]表示考虑抢劫 nums[i...n-1]所能获得的最大收益
        dp[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            //dp[i]
            for(int j=i; j<n; j++)
              dp[i] = Math.max(dp[i],nums[j]+(j+2<n?dp[j+2]:0));
            }
            return dp[0];
    }
}
