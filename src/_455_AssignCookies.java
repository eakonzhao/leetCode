import java.util.Arrays;

/**
 * Created by Eakon on 2017/7/18.
 */
public class _455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g,g.length-1,0);
        Arrays.sort(s,s.length-1,0);
        int indexG=0;
        for(int indexS=0; indexG<g.length&&indexS<s.length; indexS++){
            if(s[indexS]>=g[indexG]) indexG++;
        }
        return indexG;
    }
}
