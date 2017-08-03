import util.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Eakon on 2017/8/3.
 */
public class _435_NonOverlappingIntervals {
    /**
     * 贪心算法
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals==null||intervals.length==0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end==o2.end?o1.start-o2.start: o1.end-o2.end;
            }
        });


        int pre=0;
        int res=1;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i].start>=intervals[pre].end){
                res++;
                pre=i;
            }
        }
        return intervals.length-res;
    }

    /**
     * 动态规划
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals2(Interval[] intervals){
        if(intervals==null||intervals.length==0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2){
                return o1.start==o2.start?o1.end-o2.end : o1.start-o2.start;
            }
        });
        int[] dp = new int[intervals.length];
        Arrays.fill(dp,1);

        for(int i=1; i<intervals.length; i++){
            for(int j=0; j<i; j++){
                if(intervals[i].start>=intervals[j].end){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int res=1;
        for(int num:dp) res = Math.max(res,num);
        return intervals.length-res;
    }
}