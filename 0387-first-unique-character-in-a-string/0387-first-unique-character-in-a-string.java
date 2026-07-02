class Solution {
    public int firstUniqChar(String s) {
    
    // Create a HashMap to store character counts
    HashMap<Character, Integer> charCount = new HashMap<>();
    
    // First pass: count the frequency of each character
    for (char c : s.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    
    // Second pass: find the first character with a count of 1
    for (int i = 0; i < s.length(); i++) {
        if (charCount.get(s.charAt(i)) == 1) {
            return i;  // Return the index of the first unique character
        }
    }
    
    // If no unique character is found, return -1
    return -1;
    }
}