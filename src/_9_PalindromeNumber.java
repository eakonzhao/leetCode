/**
 * Created by Eakon on 2017/6/17.
 */
public class _9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse=0;
        int tempX=x;
        while(x>0){
            reverse=reverse*10+x%10;
            x/=10;
        }
        return tempX==reverse;
    }
}
