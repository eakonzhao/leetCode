/**
 * Created by Eakon on 2017/6/17.
 */
public class _4_MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1!=null&&nums2!=null){
            int n=nums1.length+nums2.length;
            int[] result = new int[n];
            int leftBegin=0;
            int leftEnd=nums1.length-1;
            int rightBegin=0;
            int rightEnd=nums1.length-1;
            merge(nums1,leftBegin,leftEnd,nums2,rightBegin,rightEnd,result);
            return ((n&1)==1)?result[(n-1)/2]:(result[n/2]+result[(n-1)/2])/2;
        }
        return 0;
    }

    private void merge(int[] nums1,int leftBegin,int leftEnd,int[] nums2,int rightBegin,int rightEnd,int[] result){

    }
}
