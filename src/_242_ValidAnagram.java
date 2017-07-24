import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/24.
 */
public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s!=null&&t!=null){
            if(s.length()!=t.length()) return false;
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            return Arrays.equals(sArray,tArray);
        }
        return false;
    }

    public boolean isAnagram2(String s, String t){
        if(s!=null&&t!=null){
            if(s.length()!=t.length()) return false;
            int[] letter = new int[26];
            for(int i=0; i<s.length(); i++){
                letter[s.charAt(i)-'a']++;
            }

            for(int i=0; i<t.length(); i++){
                letter[t.charAt(i)-'a']--;
                if(letter[t.charAt(i)-'a']<0) return false;
            }
            return true;
        }
        return false;
    }
}
