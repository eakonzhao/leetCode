/**
 * Created by Eakon on 2017/7/15.
 */
public class _485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        if(nums!=null||nums.length!=0){
            for(int num:nums){
                if(num==1){
                    count++;
                    max=Math.max(max,count);
                }else{
                    count=0;
                }
            }
        }
        return max;
    }
}
