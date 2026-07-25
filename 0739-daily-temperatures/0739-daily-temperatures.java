class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<n;i++){
            while(!stk.isEmpty() && temp[i]>temp[stk.peek()]){
                int prevIndex = stk.pop();
                ans[prevIndex] = i-prevIndex;
            }
            stk.push(i);
        }
        return ans;
    }
}