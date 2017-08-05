/**
 * Created by Eakon on 2017/8/4.
 * 2,3,1,1,4
 */
public class _45_JumpGameII {
    public int jump(int[] nums) {
        int count=0,curEnd=0,curFarthest=0;
        for(int i=0; i<nums.length-1; i++){
            curFarthest = Math.max(curFarthest, i+nums[i]);
            if(i==curEnd){
                count++;
                curEnd = curFarthest;
            }
        }
        return count;
    }
}
