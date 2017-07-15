import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eakon on 2017/7/15.
 */
public class _448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> list = new ArrayList<>();
        if(nums!=null&&nums.length>0){
            for(int i=0; i<nums.length; i++){
                int val=Math.abs(nums[i])-1;
                if(nums[val]>0){
                    nums[val]=-nums[val];
                }
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j]>0){
                    list.add(j+1);
                }
            }
        }
        return list;
    }
}
