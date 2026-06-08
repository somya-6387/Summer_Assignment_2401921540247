// Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }
}

// First Unique Character in a String 

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(int i = 0; i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }

        }
        return -1;
    }
}

// Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            count[c-'a']--;

            if(count[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}









