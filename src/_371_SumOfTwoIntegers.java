/**
 * Created by Eakon on 2017/7/16.
 */
public class _371_SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int sum,carry;
        do{
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b=carry;
        }while(b!=0);
        return sum;
    }
}
