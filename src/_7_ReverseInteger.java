/**
 * Created by Eakon on 2017/6/17.
 */
public class _7_ReverseInteger {

    public int reverse(int x) {
        long result=0;
        while(x!=0){
            result=result*10+x%10;
            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return 0;
            x/=10;
        }
        return (int)result;
    }
}
