/**
 * Created by Eakon on 2017/7/18.
 */
public class _453_MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            min=Math.min(num,min);
        }
        int result=0;
        for(int num:nums){
            result+=num-min;
        }
        return result;
    }
}
