import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eakon on 2017/6/18.
 */
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> listAll = new ArrayList<>();
        if(nums!=null && nums.length>2){
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++){
                if(i==0 || (i>0 && nums[i]>nums[i-1])){
                    int low = i+1;
                    int high = nums.length-1;
                    int sum = 0-nums[i];
                    while(low < high){
                        int tempSum = nums[low] + nums[high];
                        if(tempSum == sum){
                            listAll.add(Arrays.asList(nums[i],nums[low],nums[high]));
                            while(low < high && nums[low+1] == nums[low]) low++;
                            while(low < high && nums[high-1] == nums[high]) high--;
                            low++;
                            high--;
                        }else if(tempSum < sum){
                            low++;
                        }else if(tempSum > sum){
                            high--;
                        }
                    }
                }
            }
        }
        return listAll;
    }
}
