import java.util.List;

/**
 * Created by Eakon on 2017/7/25.
 */
public class _120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        List<Integer> minLen = triangle.get(n-1);
        for(int layer=n-2; layer>=0; layer--){
            for(int i=0; i<=layer; i++){
                minLen.set(i,Math.min(minLen.get(i),minLen.get(i+1))+triangle.get(layer).get(i));
            }
        }
        return minLen.get(0);
    }
}
