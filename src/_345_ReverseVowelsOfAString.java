/**
 * Created by Eakon on 2017/8/6.
 */
public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if(s==null || s.length()==0) return s;
        String set = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int low = 0;
        int high = sb.length()-1;
        while(low < high){
            while(low<high && set.indexOf(sb.charAt(low))==-1) low++;
            while(low<high && set.indexOf(sb.charAt(high))==-1 ) high--;
            swap(sb,low++,high--);
        }

        return sb.toString();
    }

    private void swap(StringBuilder sb, int low, int high){
        char temp = sb.charAt(low);
        sb.setCharAt(low,sb.charAt(high));
        sb.setCharAt(high,temp);
    }
}
