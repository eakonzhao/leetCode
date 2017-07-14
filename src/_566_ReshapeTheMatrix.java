import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Eakon on 2017/7/14.
 */
public class _566_ReshapeTheMatrix {
    /**
     * 用了一个辅助的队列
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int elements=nums.length*nums[0].length;
        int[][] result=new int[r][c];
        if(r*c>elements) return nums;
        Queue<Integer> queue = new LinkedList<>();
        for(int[] arrays:nums){
            for(int a:arrays){
                queue.offer(a);
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                result[i][j]=queue.poll();
            }
        }
        return result;
    }

    /**
     * 没有用辅助空间
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape2(int[][] nums,int r, int c){
        if(nums==null||nums.length*nums[0].length<r*c) return nums;
        int[][] result=new int[r][c];
        int column=nums[0].length;
        for(int i=0; i<r*c; i++){
            result[i/c][i%c]=nums[i/column][i%column];
        }
        return result;
    }
}
