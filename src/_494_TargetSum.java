/**
 * Created by Eakon on 2017/7/31.
 */
public class _494_TargetSum {
    int count=0;
    public int findTargetSumWays(int[] nums, int S) {
        count(nums,0,0,S);
        return count;
    }

    private void count(int[] nums, int index, int sum, int S){
        if(index==nums.length){
            if(sum==S) count++;
        }else{
            count(nums,index+1,sum-nums[index],S);
            count(nums,index+1,sum+nums[index],S);
        }
    }
}
