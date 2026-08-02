class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store = new HashSet<>();

        for(int num :nums){
            store.add(num);
        }
        int longest = 0;
        for(int num:store){
            if(!store.contains(num-1)){
                int length =1;
                while(store.contains(num+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}