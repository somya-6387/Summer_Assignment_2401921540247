// Reverse Words in a String |||

class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            ans.append(new StringBuilder(words[i]).reverse());

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
        }
    }

// Decode String

class Solution {
    public String decodeString(String s) {
      Stack<Integer>  countStack = new Stack<>();
      Stack<StringBuilder> stringStack = new Stack<>();

      StringBuilder curr = new StringBuilder();

      int k = 0;

      for(char ch : s.toCharArray()){
        if(Character.isDigit(ch)){
            k = k * 10+(ch - '0');
        }
        else if(ch =='['){
            countStack.push(k);
            stringStack.push(curr);
            curr = new StringBuilder();
            k = 0;
        }
        else if(ch == ']'){
            int repeat = countStack.pop();
            StringBuilder prev = stringStack.pop();

            for(int i = 0;i < repeat; i++){
                prev.append(curr);
            }
            curr = prev;
        }
        else{
            curr.append(ch);
        }
      }
      return curr.toString();

    }
}

// Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0,0,n);
        return result;
    }

    private void backtrack(List<String> result, String curr, int open, int close, int n){
        if(curr.length() == 2*n){
            result.add(curr);
            return;
        }
        if(open < n){
            backtrack(result, curr +"(", open +1, close , n);
        }
        if(close < open){
            backtrack(result, curr+ ")", open , close+1, n);
        }
    }
}
