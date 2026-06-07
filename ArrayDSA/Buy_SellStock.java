import java.util.*;
public class Buy_SellStock {
    public static int buySell(int prices[]) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            if(buyPrice < prices[i]){
                int Profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , Profit);
            }
            else {
                buyPrice = Math.min(buyPrice , prices[i]);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }
}
