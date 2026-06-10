// Implement strStr()

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while(i < s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

// Repeated Substring Pattern

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length()-1);
        return trimmed.contains(s);

    }
}
