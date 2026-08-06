// ─── OPTIMAL: Single pass — O(n) time, O(1) space ────────────────────────
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minProfit = Integer.MAX_VALUE;

        for(int price :prices){
            if(price < minProfit){
                minProfit = price;
            }else{
                maxProfit = Math.max(maxProfit,price-minProfit);
            }
        }
        return maxProfit;
    }
}