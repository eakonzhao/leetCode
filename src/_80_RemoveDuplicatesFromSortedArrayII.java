/**
 * Created by Eakon on 2017/8/5.
 */
public class _80_RemoveDuplicatesFromSortedArrayII {

    // [1,1,1,2,2,3] -> [1,1,2,2,3]
    public  int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int insertIndex = 0;
        for(int num : nums){
            if(insertIndex<2 || num>nums[insertIndex-2]){
                nums[insertIndex++] = num;
            }
        }
        return insertIndex;
    }
}
