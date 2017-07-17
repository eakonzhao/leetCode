/**
 * Created by Eakon on 2017/7/17.
 */
public class _598_RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        for(int [] op:ops){
            m=Math.min(m,op[0]);
            n=Math.min(n,op[1]);
        }
        return m*n;
    }
}
