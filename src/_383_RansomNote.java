import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/18.
 */
public class _383_RansomNote {
   public boolean canConstruct(String ransomNote, String magazine) {
        char[] random=ransomNote.toCharArray();
        char[] maga=magazine.toCharArray();
        Arrays.sort(random);
        Arrays.sort(maga);
        int ranIndex=0;
        for(int i=0; i<maga.length&&ranIndex<random.length; i++){
            if(random[ranIndex]==maga[i]) ranIndex++;
        }
        return ranIndex==random.length?true:false;
    }
}
