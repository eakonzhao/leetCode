/**
 * Created by Eakon on 2017/6/4.
 * https://leetcode.com/problems/integer-break/#/description
 *
 *
 *  Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers.
 *  Return the maximum product you can get.For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 *  Note: You may assume that n is not less than 2 and not larger than 58.
 */
public class _343_IntegetBreak {
    /**
     * 自顶向下，采用记忆化搜索解决问题
     * @param n
     * @return
     */
    public int integerBreak(int n){
        int[] memory = new int[n+1];
        for(int i=0; i<memory.length; i++){
            memory[i]=-1;
        }
        return breakInteger(n,memory);
    }

    private int breakInteger(int n,int[] memory){
        if(n==1) return 1;

        if(memory[n] != -1) return memory[n];
        int result =-1;
        //记得这里的循环控制语句是 i<n ，因为i最大为n-1-> n=(n-1)+1;
        for(int i=1; i<n; i++){
            result = Max3(result,i*(n-i),i*breakInteger(n-i,memory));
        }
        memory[n] = result;
        return result;
    }

    private int Max3(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    /**
     *
     * 上面是自顶向下，记忆化搜索
     *
     * 下面是动态规划解决该问题
     */
    public int integerBreak2(int n){
        //dp[i]表示将数字i分割(至少分割成两部分)后得到的最大乘积
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<dp.length; i++){
            //求解dp[i]
            for(int j=1; j<=i-1; j++){
                // j + (i-j)
                dp[i] = Max3(dp[i],j*(i-j),j*dp[i-j]);
            }
        }
        return dp[n];
    }
}
