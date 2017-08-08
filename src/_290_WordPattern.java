import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/8/8.
 */
public class _290_WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(pattern.length() != strings.length) return false;
        Map map = new HashMap();
        for(Integer i=0; i<strings.length; ++i){
            if(map.put(pattern.charAt(i),i) != map.put(strings[i],i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(1);
        System.out.println(i1==i2);
    }
}
