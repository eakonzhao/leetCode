import java.util.Arrays;

/**
 * Created by Eakon on 2017/6/18.
 */
public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs!=null&&strs.length>0){
            Arrays.sort(strs);
            char[] first=strs[0].toCharArray();
            char[] last=strs[strs.length-1].toCharArray();
            for(int i=0; i<first.length; i++){
                if(i<last.length&&first[i]==last[i]) sb.append(first[i]);
                else return sb.toString();
            }
        }
        return sb.toString();
    }
}
