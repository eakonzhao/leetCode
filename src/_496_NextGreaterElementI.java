import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Eakon on 2017/7/14.
 */
public class _496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums,int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        LinkedList<Integer> stack = new LinkedList<>();
        for(int num:nums){
            while(!stack.isEmpty()&&stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0; i<findNums.length; i++){
            findNums[i]=map.getOrDefault(findNums[i],-1);
        }
        return findNums;
    }
}
