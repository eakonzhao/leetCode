import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _454_4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        int result=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(map.containsKey(A[i]+B[j])){
                    map.put(A[i]+B[j],map.get(A[i]+B[j])+1);
                } else {
                    map.put(A[i]+B[j],1);
                }
            }
        }

        for(int i=0; i<C.length; i++){
            for(int j=0; j<D.length; j++){
                if(map.containsKey(0-C[i]-D[j])){
                    result += map.get(0-C[i]-D[j]);
                }
            }
        }

        return result;
    }
}
