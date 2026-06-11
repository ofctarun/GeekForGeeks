class Solution {
    public int findIndex(String s) {
        // code here
        int open = 0,close = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')')close++;
        }
        for(int i = 0; i < s.length(); i++){
            if(open == close)return i;
            if(s.charAt(i) == '(')open++;
            if(s.charAt(i) == ')')close--;
        }
        return s.length();
    }
}