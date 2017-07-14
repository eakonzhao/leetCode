import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/7/14.
 */
public class _575_DistributeCandies {
    /**
     * 用一个辅助set
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        if(candies==null||candies.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int element:candies){
            set.add(element);
        }
        return Math.min(set.size(),candies.length/2);
    }

    /**
     * 不借助辅助空间，先排序
     * 时间复杂度O(nlogN)
     * 空间复杂度O(1)
     * @param candies
     * @return
     */
    public int distributeCandies2(int[] candies){
        if(candies==null||candies.length==0) return 0;
        Arrays.sort(candies);
        int count=1;
        for(int i=1; i<candies.length&&count<candies.length/2; i++){
            if(candies[i]>candies[i-1]) count++;
        }
        return count;
    }
}
