import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/6/16.
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        if(s!=null&&s.length()!=0){
            Set<Character> set = new HashSet<>();
            int i=0,j=0;
            while(j<s.length()){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    result=Math.max(result,set.size());
                }else{
                    set.remove(s.charAt(i++));
                }
            }
        }
        return result;
    }
}
