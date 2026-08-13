class Solution {
    public boolean isValid(String s) {
    int prevLen = -1;

    while (prevLen != s.length()) {
        prevLen = s.length();
        s = s.replace("()", "")
             .replace("{}", "")
             .replace("[]", "");
    }

    return s.length() == 0;
    }
}