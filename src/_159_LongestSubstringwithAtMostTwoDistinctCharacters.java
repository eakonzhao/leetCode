/**
 * Created by Eakon on 2017/8/7.
 */
public class _159_LongestSubstringwithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s){
        int begin=0, end=0, count=0, length=0;
        int[] hash = new int[256];
        while(end < s.length()){
            if(hash[s.charAt(end)] == 0){
                count++;
            }
            hash[s.charAt(end)]++;
            end++;

            while(count > 2){
                if(hash[s.charAt(begin)] == 1){
                    count--;
                }
                hash[s.charAt(begin)]--;
                begin++;
            }
            length = Math.max(length,end-begin);
        }
        return length;
    }
}
