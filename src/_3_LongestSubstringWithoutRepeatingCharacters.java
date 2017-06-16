import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/6/16.
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int result=0;
        int count=0;
        if(s!=null&&s.length()!=0){
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                for(int j=i; j<s.length(); j++){
                    if(map.containsKey(s.charAt(j))){
                        map.clear();
                        break;
                    }else{
                        map.put(s.charAt(j),1);
                        count++;
                    }
                }
                result=(count>result)?count:result;
                count=0;
            }
        }
        return result;
    }
}
