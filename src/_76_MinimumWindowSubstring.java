/**
 * Created by Eakon on 2017/8/7.
 */
public class _76_MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int begin=0, end=0, resLength=s.length()+1, resBegin=0, resEnd=0, count=t.length();
        int[] hash = new int[256];
        for(char c : t.toCharArray()){
            hash[c]++;
        }

        while (end < s.length()) {
            if(hash[s.charAt(end)] > 0){
                count--;
            }
            hash[s.charAt(end)]--;
            end++;

            while(count == 0){
                if(end-begin < resLength){
                    resBegin = begin;
                    resEnd = end;
                    resLength = end-begin;
                }

                if(hash[s.charAt(begin)]==0){
                    count++;
                }
                hash[s.charAt(begin)]++;
                begin++;
            }
        }
        return resLength==s.length()+1?"":s.substring(resBegin,resEnd);
    }
}
