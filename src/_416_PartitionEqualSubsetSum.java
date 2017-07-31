/**
 * Created by Eakon on 2017/7/31.
 */
public class _416_PartitionEqualSubsetSum {
    /**
     * 转换为01背包问题解决
     */
    //dp[i][c] 表示使用索引为[0...i]的这些元素，是否可以完全填充一个容量为c的背包
    // -1 表示未计算；0 表示不可填充； 1表示可以填充
    int[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        dp = new int[nums.length][sum/2+1];
        return sum%2==0?tryPartition(nums,nums.length-1,sum/2):false;
    }

    private boolean tryPartition(int[] nums, int index, int sum){
        if(sum==0) return true;
        if(sum<0||index<0) return false;
        if(dp[index][sum]!=1) return dp[index][sum]==1?true:false;
        dp[index][sum] = (tryPartition(nums,index-1,sum)||tryPartition(nums,index-1,sum-nums[index]))==true?1:0;
        return dp[index][sum]==1?true:false;
    }


    /**
     * 自底向上 动态规划
     */
    public boolean canPartition2(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int n=nums.length;
        int C=sum/2;
        boolean[] dp = new boolean[C+1];
        for(int i=0; i<=C; i++){
            dp[i]=(nums[0]==i);
        }

        for(int i=1; i<n; i++){
            for(int j=C; j>=nums[i]; j--){
                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[C];
    }
}
