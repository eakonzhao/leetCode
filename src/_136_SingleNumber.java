/**
 * Created by Eakon on 2017/7/15.
 */
public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}
