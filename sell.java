public class sell {
    public static void main(String[] args) {
        sell s = new sell();
        int[] prices = {74, 10, 64, 45, 53, 35};
        int result = s.sellBuy(prices);
        System.out.println(result); 
    }

    public int sellBuy(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
