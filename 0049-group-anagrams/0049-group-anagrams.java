//Time complexity: O(m∗n)
//Space complexity: O(1)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> store = new HashMap<>();

        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            String sortedS = new String(charArray);
            store.putIfAbsent(sortedS, new ArrayList<>());
            store.get(sortedS).add(s);
        
        }
        return new ArrayList<>(store.values());
    }
}