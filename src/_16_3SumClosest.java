import java.util.Arrays;

/**
 * Created by Eakon on 2017/6/18.
 */
public class _16_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            if(i==0 || i>0&&nums[i]!=nums[i-1]){
                int low=i+1;
                int high=nums.length-1;
                while(low<high){
                  int sum=nums[i]+nums[low]+nums[high];
                    if(sum==target){
                        return sum;
                    }else if(sum<target){
                        while(low<high&&nums[low]==nums[low+1]) low++;
                        low++;
                    }else{
                        while(low<high&&nums[high]==nums[high-1]) high--;
                        high--;
                    }

                    if(Math.abs(target-sum)<Math.abs(target-closest)){
                        closest=sum;
                    }
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums={-3,-2,-5,3,-4};
        int result=threeSumClosest(nums,-1);
        System.out.println(result);
    }
}
