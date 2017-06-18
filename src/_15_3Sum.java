import java.util.*;

/**
 * Created by Eakon on 2017/6/18.
 */
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        if(nums!=null&&nums.length>2){
            for(int i=0; i<nums.length; i++){
                int low=i+1;
                int high=nums.length-1;
                int sum=0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        listAll.add(Arrays.asList(nums[i],nums[low],nums[high]));

                    }
                }
            }
        }
        return listAll;
    }
}
