class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int i = 0,j = 0,ans = -1;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            while(hm.size() > k){
                char left = s.charAt(i);
                hm.put(left, hm.get(left) - 1);
                if(hm.get(left) == 0)hm.remove(left);
                i++;
            }
            if(hm.size() == k)ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}