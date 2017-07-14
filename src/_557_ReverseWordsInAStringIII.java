/**
 * Created by Eakon on 2017/7/14.
 */
public class _557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder(s);
        if(s!=null&&s.length()>0){
            int start=0,end=0;
            while(start<=end&&end<result.length()){
                if(end!=result.length()-1&&result.charAt(end)!=' '){
                    end++;
                }else{
                    if(end<result.length()-1) {
                        reverse(result, start, end-1);
                        start=end+1;
                        end=end+1;
                    }else{
                        reverse(result,start,end);
                        break;
                    }
                }
            }
        }
        return result.toString();
    }

    private void reverse(StringBuilder sb,int start,int end){
        if(sb==null||sb.length()==0) return;
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);
        }
    }
}
