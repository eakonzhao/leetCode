/**
 * Created by Eakon on 2017/7/12.
 */
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0) return 0;
        int insertIndex=0;
        for(int num:nums){
            if(num!=val){
                nums[insertIndex++] = num;
            }
        }
        return insertIndex;
    }
}
