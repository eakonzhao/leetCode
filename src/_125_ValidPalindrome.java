/**
 * Created by Eakon on 2017/8/6.
 */
public class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        int left = 0;
        int right = sb.length()-1;
        while(left < right){
            while( left<right && !(sb.charAt(left)>='a'&&sb.charAt(left)<='z') && !(sb.charAt(left)>='0'&&sb.charAt(left)<='9') ) left++;
            while( left<right && !(sb.charAt(right)>='a'&&sb.charAt(right)<='z') && !(sb.charAt(right)>='0'&&sb.charAt(right)<='9') ) right--;
            if(sb.charAt(left) == sb.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
