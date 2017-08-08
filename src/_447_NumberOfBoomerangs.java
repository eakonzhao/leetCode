import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _447_NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        if(points==null || points.length==0) return 0;
        int result = 0;
        for(int i=0; i<points.length; i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=0; j<points.length; j++){
                if(i != j){
                    int distance = distance(points[i],points[j]);
                    map.put(distance,map.getOrDefault(distance,0)+1);
                }
            }

            for(Integer num : map.keySet()){
                if(map.get(num) >=2 ){
                    result += map.get(num) * (map.get(num)-1);
                }
            }
            map.clear();
        }
        return result;
    }

    private int distance(int[] nums1, int[] nums2){
        return (nums1[0]-nums2[0])*(nums1[0]-nums2[0]) + (nums1[1]-nums2[1])*(nums1[1]-nums2[1]);
    }
}
