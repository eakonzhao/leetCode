/**
 * Created by Eakon on 2017/8/4.
 */
public class _55_JumpGame {
    /**
     *  暴力解法 递归
     * private static boolean canJumpFromPosition(int position, int[] nums){
        if(position==nums.length-1){
            return true;
        }

        int furthestJump = Math.min(position+nums[position],nums.length-1);

        for(int nextPosition=position+1; nextPosition<=furthestJump; nextPosition++){
            if(canJumpFromPosition(nextPosition,nums)){
                return true;
            }
        }
        return false;
    }

    public static boolean canJump(int[] nums) {
        return canJumpFromPosition(0,nums);
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }*/

    enum Index{
        GOOD,BAD,UNKNOW
    }

    /**
     * 记忆化搜索 （自顶向下）
    Index[] dp;

    public boolean canJump(int[] nums){
        dp = new Index[nums.length];
        for(int i=0; i<dp.length; i++){
            dp[i] = Index.UNKNOW;
        }

        dp[dp.length-1] = Index.GOOD;
        return canJumpFromPosition(0,nums);
    }

    private boolean canJumpFromPosition(int position, int[] nums){
        if(dp[position]!=Index.UNKNOW){
            return dp[position] == Index.GOOD;
        }

        int furthestJump = Math.min(position+nums[position], nums.length-1);

        for(int nextPosition=position+1; nextPosition<=furthestJump; nextPosition++){
            if(canJumpFromPosition(nextPosition,nums)){
                dp[nextPosition] = Index.GOOD;
                return true;
            }
        }

        dp[position] = Index.BAD;
        return false;
    }*/

    /**
     *
     * 动态规划 （自底向上）
     *
     * public boolean canJump(int[] nums){
        Index[] dp = new Index[nums.length];
        dp[dp.length-1] = Index.GOOD;
        for(int i=dp.length-2; i>=0; i--){
            int furthestJump = Math.min(i+nums[i],nums.length-1);
            for(int j=i+1; j<=furthestJump; j++){
                if(dp[j]==Index.GOOD){
                    dp[i]=Index.GOOD;
                }
            }
        }
        return dp[0]==Index.GOOD;
    }*/

    public boolean canJump(int[] nums){
        int lastPos = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i+nums[i]>=lastPos){
                lastPos=i;
            }
        }
        return lastPos==0;
    }
}