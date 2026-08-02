//Time complexity: O(m∗nlogn)
//Space complexity: O(m∗n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> seen = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String Sorted = new String(ch);
            seen.putIfAbsent(Sorted,new ArrayList<>());
            seen.get(Sorted).add(s);
        }
        return new ArrayList<>(seen.values());
    }
}