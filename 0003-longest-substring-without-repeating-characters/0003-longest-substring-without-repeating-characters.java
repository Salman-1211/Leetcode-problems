// ─── OPTIMAL: Sliding Window + HashMap — O(n) time, O(min(n,m)) space ────
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;

        for(int i=0;i<n;i++){
            HashSet<Character> store = new HashSet<>();
            for(int j = i;j<n;j++){
                if(store.contains(s.charAt(j))){
                    break;
                }
                store.add(s.charAt(j));
            }
            ans = Math.max(ans,store.size());
        }
        return ans;
    }
}