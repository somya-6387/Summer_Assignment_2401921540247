//  Valid Palindrome 

class Solution {
    public boolean isPalindrome(String s) {
        
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

           
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}

//  Reverse String 

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

// Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs == null || strs.length == 0){
        return "";
       } 
       String prefix = strs[0];

       for(int i =1; i<strs.length; i++){
        while(strs[i].indexOf(prefix)!=0){
            prefix = prefix.substring(0 , prefix.length()-1);

            if(prefix.isEmpty()){
                return "";
            }
        }
       }
       return prefix;
    }
}
