/**
 * Created by Eakon on 2017/7/22.
 */
public class _122_BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int day=0;
        int valley,peek;
        int maxProfit=0;
        while(day<prices.length-1){
            while(day<prices.length-1&&prices[day]>=prices[day+1]) day++;
            valley=prices[day];
            while(day<prices.length-1&&prices[day]<=prices[day+1]) day++;
            peek=prices[day];
            maxProfit+=peek-valley;
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices){
        int maxProfit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}
