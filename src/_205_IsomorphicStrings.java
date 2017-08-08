/**
 * Created by Eakon on 2017/8/8.
 */
public class _205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] hash = new int[512];

        for(int i=0; i<s.length(); i++){
            if(hash[s.charAt(i)] != hash[t.charAt(i)+256]){
                return false;
            }
            hash[s.charAt(i)]=i+1;
            hash[t.charAt(i)+256]=i+1;
        }
        return true;
    }
}
