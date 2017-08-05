/**
 * Created by Eakon on 2017/8/5.
 */
public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2==null) return ;
        int index=(m+n)-1;
        m--;
        n--;

        while(m>=0&&n>=0){
            if(nums1[m] >= nums2[n]){
                nums1[index--] = nums1[m--];
            }else{
                nums1[index--] = nums2[n--];
            }
        }

        while(m>=0){
            nums1[index--] = nums1[m--];
        }

        while(n>=0){
            nums1[index--] = nums2[n--];
        }
    }
}
