class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for(int num : nums){
            if(num>largest){
                sec_largest = largest;
                largest = num;
            }else{
                sec_largest = Math.max(sec_largest, num);
            }
        }
            return (largest -1)*(sec_largest -1);
    }
}