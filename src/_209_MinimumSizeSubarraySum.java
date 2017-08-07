/**
 * Created by Eakon on 2017/8/6.
 */
public class _209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int result = nums.length+1;
        int left = 0;
        int right = -1;
        int sum = 0;

        while( left < nums.length ){
            if(sum < s){
                sum += nums[++right];
            }else{
                sum -= nums[left++];
            }

            if(sum >= s){
                result = Math.min(result, right-left+1);
            }
        }
        return result==nums.length+1?0:result;
    }
}
