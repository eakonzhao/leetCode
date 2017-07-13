/**
 * Created by Eakon on 2017/7/13.
 */
public class _461_HammingDistance {
    public int hammingDistance(int x, int y) {
        return getCountOfOne(x^y);
    }
    private int getCountOfOne(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num&(num-1);
        }
        return count;
    }
}
