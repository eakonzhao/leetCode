import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/23.
 */
public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement2(int[] nums){
        int majority=nums[0];
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(count==0){
                majority=nums[i];
                count++;
            }
            else if(majority==nums[i]) count++;
            else count--;
        }
        return majority;
    }
}
