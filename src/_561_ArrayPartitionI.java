import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/13.
 */
public class _561_ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums==null||nums.length==0) return 0;
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
