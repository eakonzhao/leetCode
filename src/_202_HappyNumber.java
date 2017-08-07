/**
 * Created by Eakon on 2017/8/7.
 */
public class _202_HappyNumber {
    public boolean isHappy(int n) {
        int fast=n, slow=n;
        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if(fast == 1) return true;
        }while(slow != fast);
        return false;
    }

    private int digitSquareSum(int n){
        int sum=0, temp;
        while(n != 0){
            temp = n%10;
            sum += temp*temp;
            n /= 10;
        }
        return sum;
    }
}
