public class Stock {
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(cal(prices));
    }
    
    public static int cal(int prices[]) {
        int maxProfit = 0, buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}