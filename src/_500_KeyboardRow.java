import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Eakon on 2017/7/14.
 */
public class _500_KeyboardRow {
    public String[] findWords(String[] words) {
        if(words==null||words.length==0) return null;
        String[] letters={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<letters.length; i++){
            for(char c:letters[i].toCharArray()){
                map.put(c,i);
            }
        }
        List<String> list = new LinkedList<>();
        for(String str:words){
            if(str.equals("")) continue;
            int index=map.get(str.toUpperCase().charAt(0));
            for(char c:str.toUpperCase().toCharArray()){
                if(map.get(c)!=index){
                    index=-1;
                    break;
                }
            }
            if(index!=-1) list.add(str);
        }
        return list.toArray(new String[0]);
    }
}
