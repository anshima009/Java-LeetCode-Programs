public class bestTimeToSellAndBuy {
    
        public int maxProfit(int[] prices) {
            int minValue=prices[0];
            int maxProf=0;
            for(int i=1;i<prices.length;i++){
                maxProf=Math.max(maxProf,prices[i]-minValue);
                minValue=Math.min(prices[i],minValue);
            }
            return maxProf;
        }
    
}
