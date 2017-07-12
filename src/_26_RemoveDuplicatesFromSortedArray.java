/**
 * Created by Eakon on 2017/7/12.
 */
public class _26_RemoveDuplicatesFromSortedArray {
    /**
     * 自己一开始的解答 可以AC 时间复杂度太高了
     */
 /*   public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int length=nums.length;
        int index=0;
        int duplicateCounts=0;
        int end=length;
        while(index<end){
            while((index+1<end)&&(nums[index]==nums[index+1])){
                deleteDuplicateNumber(nums,index);
                end--;
                duplicateCounts++;
                if(nums[index]!=nums[index]){
                    index++;
                }
            }
            index++;
        }
        return length-duplicateCounts;
    }

    private static void deleteDuplicateNumber(int[] nums,int step){
        if(nums==null||nums.length==0) return;
        while(step<nums.length-1){
            nums[step]=nums[step+1];
            step++;
        }
    }*/

    /**
     * 最优解 时间复杂度为O(n)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int i=1;
        for(int n:nums){
            if(n>nums[i-1]){
                nums[i++]=n;
            }
        }
        return i;
    }

}
