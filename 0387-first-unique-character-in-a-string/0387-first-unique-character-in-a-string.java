class Solution {
    public int firstUniqChar(String s) {
    
    int[] charCount = new int[26];
    
    // First pass: count character frequencies using array
    for (char c : s.toCharArray()) {
        charCount[c - 'a']++;
    }
    
    // Second pass: find first unique character
    for (int i = 0; i < s.length(); i++) {
        if (charCount[s.charAt(i) - 'a'] == 1) {
            return i;
        }
    }
    
    return -1;
    }
}