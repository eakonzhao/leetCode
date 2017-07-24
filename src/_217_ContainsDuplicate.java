import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/7/24.
 */
public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums!=null&&nums.length>1){
            if(nums.length==1) return true;
            Arrays.sort(nums);
            for(int i=1; i<nums.length; i++){
                if(nums[i]==nums[i-1]) return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums){
        if(nums!=null&&nums.length>1){
            Set<Integer> set = new HashSet<>();
            for(int num:nums){
                if(set.contains(num)) return true;
                set.add(num);
            }
        }
        return false;
    }
}
