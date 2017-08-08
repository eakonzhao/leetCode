import java.util.*;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _451_SortCharactersByFrequency {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->(b.getValue() - a.getValue()));
        for(Map.Entry<Character,Integer> m : list){
            for(int i=0; i<m.getValue(); i++){
                result.append(m.getKey());
            }
        }
        return result.toString();
    }
}
