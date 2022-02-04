package maxProfit;

public class maxProfit {
	public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int final_max = 0;
        for(int i = 0;i < prices.length; i++){
            if(prices[i] < min)
                min = prices[i];
            else if(prices[i] - min > final_max)
                final_max = prices[i] - min;
        }
        return final_max;
    }

    //medium task max profit with fee
    public static int maxProfit(int[] prices, int fee) {
        int max = 0;
        int stocks = -prices[0];
        for(int i = 0; i < prices.length; i++){
            if(max < stocks + prices[i] - fee )
                max = stocks + prices[i] - fee;
            if(stocks < max - prices[i])
                stocks = max -prices[i];
        }
        return max;
    }

}
