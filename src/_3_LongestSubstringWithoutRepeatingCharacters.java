/**
 * Created by Eakon on 2017/6/16.
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {
    /**
     * 滑动窗口问题  438 76
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s){
        int begin=0, end=0, length=0;
        int[] hash = new int[256];
        while(end < s.length()){
            if(hash[s.charAt(end)]==0){
                hash[s.charAt(end)]++;
                end++;
            }else{
                hash[s.charAt(begin)]--;
                begin++;
            }
            length = Math.max(length,end-begin);
        }
        return length;
    }
}
