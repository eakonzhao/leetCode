/**
 * Created by Eakon on 2017/7/12.
 */
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;
        int i=0;
        for(int n:nums){
            if(n!=val){
                nums[i++]=n;
            }
        }
        return i;
    }
}
