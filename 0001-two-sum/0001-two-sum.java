class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer,Integer> store = new HashMap<>();

        for(int i =0;i<n;i++){
            int ans = target-nums[i];

            if(store.containsKey(ans)){
                return new int[]{store.get(ans),i};
            }
            store.put(nums[i],i);
        }
        return new int[]{};
    }
}