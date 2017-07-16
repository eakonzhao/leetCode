/**
 * Created by Eakon on 2017/7/16.
 */
public class _283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0) return;
        int zeroIndex=nums.length-1;
        for(int i=0; i<zeroIndex; i++){
            if(nums[i]==0&&zeroIndex>0){
                for(int j=i+1; j<zeroIndex; j++){
                    nums[j-1]=nums[j];
                }
                nums[zeroIndex--]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
