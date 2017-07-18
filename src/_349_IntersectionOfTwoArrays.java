import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/7/18.
 */
public class _349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }
        int[] result=new int[resultSet.size()];
        int i=0;
       for(int num:resultSet){
           result[i++]=num;
       }
        return result;
    }
}
