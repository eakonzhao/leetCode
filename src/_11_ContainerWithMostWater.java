/**
 * Created by Eakon on 2017/6/18.
 * 题意：在二维坐标系中，(i, ai) 表示 从 (i, 0) 到 (i, ai) 的一条线段，任意两条这样的线段和 x 轴组成一个木桶，找出能够盛水最多的木桶，返回其容积。
 */
public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height==null||height.length<2) return 0;
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}

