/**
 * Created by Eakon on 2017/8/5.
 */
public class _75_SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<2) return ;
        int zero = -1;
        int two = nums.length;
        for(int i=0; i<two;){
            if(nums[i] == 1){
                i++;
            }else if(nums[i] == 0){
                swap(nums, ++zero, i++);
            }else if(nums[i] == 2){
                swap(nums, --two, i);
            }
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}