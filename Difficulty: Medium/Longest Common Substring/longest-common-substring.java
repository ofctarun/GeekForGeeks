class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int i = 0, j = 1, ans = 0;
        while(j <= s1.length()){
            if(s2.contains(s1.substring(i,j))){
                ans = Math.max(j - i, ans);
                j++;
            }
            else{
                i++;
                if(i >= j)j = i + 1;
            }
        }
        return ans;
    }
}