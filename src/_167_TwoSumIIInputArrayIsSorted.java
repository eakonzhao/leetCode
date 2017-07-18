/**
 * Created by Eakon on 2017/7/18.
 */
public class _167_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int sum=0;
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            else if(sum<target) left++;
            else if(sum>target) right--;
        }
        return result;
    }
}
