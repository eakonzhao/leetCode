import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left=0, right=0;
        while(right < nums.length){
            if(!set.contains(nums[right])){
                set.add(nums[right]);
            }else{
                return true;
            }
            right++;
            if(right - left > k){
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
