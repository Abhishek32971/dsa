public class BestTimeToBuyAndSell121 {
    public static  int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
        
    }
    public static void main(String[] args) {
        int[] i = {2,3,4};
        System.out.println(maxProfit(i));
    }
}
