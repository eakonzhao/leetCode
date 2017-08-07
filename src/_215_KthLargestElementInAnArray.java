import java.util.Random;

/**
 * Created by Eakon on 2017/8/7.
 */
public class _215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        k = nums.length-k;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int index = partition(nums,left,right);
            if(index < k) {
                left = index + 1;
            } else if (index > k) {
                right = index - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int lo, int hi) {
        int tag = nums[lo];
        int j=lo;
        for(int i=lo+1; i<=hi; i++){
            if(nums[i] < tag){
                swap(nums,++j,i);
            }
        }
        swap(nums,lo,j);
        return j;
    }


    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void shuffle(int[] nums){
        Random random = new Random();
        for(int i=0; i<nums.length; i++){
            int r = random.nextInt(i+1);
            swap(nums,i,r);
        }
    }
}
