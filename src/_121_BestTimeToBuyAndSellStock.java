/**
 * Created by Eakon on 2017/7/22.
 */
public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i< prices.length; i++){
            if(prices[i]<minPrice) minPrice=prices[i];
            else maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}
