import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/6/16.
 */
public class _1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums!=null&&nums.length>1){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    result[1]=i;
                    result[0]=map.get(target-nums[i]);
                }
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
