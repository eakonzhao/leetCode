import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/7/23.
 */
public class _387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if(s!=null||s.length()!=0){
            Map<Character,Integer> map = new HashMap<>();
            for(char ch:s.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }

            for(int i=0; i<s.length(); i++){
                if(map.get(s.charAt(i))==1) return i;
            }
        }
        return -1;
    }
}
