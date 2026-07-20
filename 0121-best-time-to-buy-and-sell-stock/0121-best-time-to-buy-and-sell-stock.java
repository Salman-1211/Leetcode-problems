// ─── OPTIMAL: Single pass — O(n) time, O(1) space ────────────────────────
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minProfit = Integer.MAX_VALUE; 
        int maxProfit = 0;

        for(int price:prices){
            if(price < minProfit){
                minProfit = price;
            }else{
                maxProfit = Math.max(maxProfit, price-minProfit);
            }
        }
        return maxProfit;
    }
}