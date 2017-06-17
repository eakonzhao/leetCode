/**
 * Created by Eakon on 2017/6/17.
 */
public class _8_StringtoInteger {
    public static int myAtoi(String str) {
        if(str==null||str.length()==0) return 0;
        int limit=-Integer.MAX_VALUE;
        boolean negative = false;
        int result=0;
        int index=0;
        while(str.charAt(index)==' '&&index<str.length()){
            index++;
        }
        if(str.charAt(index)=='+'||str.charAt(index)=='-'){
            if(str.charAt(index)=='-'){
                limit = Integer.MIN_VALUE;
                negative=true;
            }
            if(str.length()==1) return 0;
            index++;
        }
        int seLimit = limit/10;
        while(index<str.length()){
            if(str.charAt(index)>'9'||str.charAt(index)<'0') break;
            int digit=Character.digit(str.charAt(index++),10);
            if(result<seLimit) return negative?limit:-limit;
            result*=10;
            if(result<limit+digit) return negative?limit:-limit;
            result-=digit;
        }
        return negative?result:-result;
    }
}
