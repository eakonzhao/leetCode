/**
 * Created by Eakon on 2017/8/3.
 */
public class _392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int indexS=s.length()-1;
        int indexT=t.length()-1;
        while(indexS>=0&&indexT>=0){
            if(s.charAt(indexS)==t.charAt(indexT)){
                indexT--;
                indexS--;
            }else{
                indexT--;
            }
        }
        return indexS<0?true:false;
    }

}
