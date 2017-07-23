import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/22.
 */
public class _506_RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        if(nums!=null&&nums.length!=0){
            int[][] pairs = new int[nums.length][2];
            for(int i=0; i<nums.length; i++){
                pairs[i][0]=nums[i];
                pairs[i][1]=i;
            }

            Arrays.sort(pairs,(a,b)->(b[0]-a[0]));
            String[] result = new String[nums.length];
            for(int i=0; i<nums.length; i++){
                if(i==0){
                    result[pairs[i][1]]="Gold Medal";
                }else if(i==1){
                    result[pairs[i][1]]="Silver Medal";
                }else if(i==2){
                    result[pairs[i][1]]="Bronze Medal";
                }else{
                    result[pairs[i][1]]=i+1+"";
                }
            }
            return result;
        }
        return null;
    }
}
