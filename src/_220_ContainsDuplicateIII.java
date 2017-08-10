import java.util.TreeSet;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _220_ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       if(nums == null || nums.length==0 || k < 1 || t < 0) return false;
        TreeSet<Long> set = new TreeSet<>();
        int left = 0, right = 0;
        while(right < nums.length){
            Long floor = set.ceiling((long)nums[right] - t);
            Long ceil =  set.floor((long)nums[right] + t);
            if(floor!=null && floor<=nums[right] || ceil!=null && ceil>=nums[right]) return true;
            set.add((long)nums[right]);
            right++;

            if(right - left > k){
                set.remove((long)nums[left]);
                left++;
            }
        }
        return false;
    }
}
