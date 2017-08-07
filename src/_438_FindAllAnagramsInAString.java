import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eakon on 2017/8/6.
 */
public class _438_FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
            int begin=0, end=0, count=p.length();
            int[] hash = new int[256];
            for(char c : p.toCharArray()){
                hash[c]++;
            }
            while(end < s.length()){
                if(hash[s.charAt(end)] > 0){
                    count--;
                }
                hash[s.charAt(end)]--;
                end++;
                if(count == 0){
                    list.add(begin);
                }
                if(end-begin == p.length()){
                    if(hash[s.charAt(begin)] >= 0){
                        count++;
                    }
                    hash[s.charAt(begin)]++;
                    begin++;
                }
            }
        return list;
    }
}