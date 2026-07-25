class Solution {
    public int maxProduct(int num) {
        int top1 = 0, top2 =0;

        while(num >0){
            int digit = num%10; //extract last digit
            num /= 10;          // remove last digit

            if(digit >= top1){
                //new largest found!
                // update old top1 become top2
                top2 = top1;
                top1 = digit;
            }
            else if(digit > top2){
                top2 = digit;
            }
        }
        return top1 * top2;
    }
}