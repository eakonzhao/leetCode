/**
 * Created by Eakon on 2017/7/14.
 */
public class _344_ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s!=null&&s.length()!=0){
            int start=0;
            int end=sb.length()-1;
            while(start<end){
                char temp=sb.charAt(start);
                sb.setCharAt(start++,sb.charAt(end));
                sb.setCharAt(end--,temp);
            }
        }
        return sb.toString();
    }
}
