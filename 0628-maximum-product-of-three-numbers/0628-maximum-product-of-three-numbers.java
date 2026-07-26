class Solution {
    public int maximumProduct(int[] nums) {
        // 3 largest Values
        int top1 = Integer.MIN_VALUE;
        int top2 = Integer.MIN_VALUE;
        int top3 = Integer.MIN_VALUE;

        //2 smallest value
        int bot1 = Integer.MAX_VALUE;
        int bot2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num>=top1){
                top3 = top2;
                top2 = top1;
                top1 = num;
            }else if(num>=top2){
                top3 = top2;
                top2 = num;
            }else if(num>top3){
                top3 = num;
            }
            if(num<=bot1){
                bot2 = bot1;
                bot1 = num;
            }else if(num <bot2){
                bot2 = num;
            }
        }
        int opt1 = top1*top2*top3;

        int opt2 = bot1*bot2*top1;

        return Math.max(opt1,opt2);
    }
}