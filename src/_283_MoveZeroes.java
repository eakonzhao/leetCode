/**
 * Created by Eakon on 2017/7/16.
 */
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
       if(nums==null||nums.length==0) return;
        int insertPos=0;
        for(int num:nums){
            if(num!=0) nums[insertPos++]=num;
        }
        while(insertPos<nums.length) nums[insertPos++]=0;
    }
}
