/**
 * Created by Eakon on 2017/7/15.
 */
public class _520_DetectCapital {
    public boolean detectCapitalUse(String word) {
       int count=0;
        for(char ch:word.toCharArray())
            if(ch-'Z'>0) count++;
        return (count==0||count==word.length())||(count==word.length()-1&&word.charAt(0)-'Z'<=0);
    }
}
