//  Group Anagrams 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

//  String Compression

class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;

        while(i < chars.length){
            char currChar =chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == currChar){
                i++;
                count++;
            }
            chars[idx++] = currChar;
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}

// Longest Plaindromic SubString

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }
        int start = 0 , end = 0;

        for(int i =0;i < s.length(); i++){
            int len1 = expandAroundCenter(s, i ,i);
            int len2 = expandAroundCenter(s, i , i+1);
            int len = Math.max(len1 , len2);

            if(len > end - start){
                start = i -(len-1)/2;
                end = i + len/2;
            }
         }
         return s.substring(start, end+1);
    }

    private int expandAroundCenter(String s, int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }
  }
