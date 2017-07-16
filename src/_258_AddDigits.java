/**
 * Created by Eakon on 2017/7/16.
 */
public class _258_AddDigits {
    public int addDigits(int num) {
        return num==0?0:(num%9==0)?9:(num%9);
    }
}
