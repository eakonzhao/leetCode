import java.util.*;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String temp = String.valueOf(chars);
            map.putIfAbsent(temp,new ArrayList<String>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
