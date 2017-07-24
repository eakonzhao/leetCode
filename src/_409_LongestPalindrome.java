import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eakon on 2017/7/24.
 */
public class _409_LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s!=null&&s.length()!=0){
            Set<Character> set = new HashSet<>();
            for(char ch:s.toCharArray()){
                if(set.contains(ch)) set.remove(ch);
                else set.add(ch);
            }
            return s.length()-(set.isEmpty()?0:set.size()-1);
        }
        return 0;
    }
}
