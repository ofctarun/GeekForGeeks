class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n = s.length();
        if(n % k != 0)return false;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i+=k){
            String block = s.substring(i, i + k);
            hm.put(block, hm.getOrDefault(block, 0) + 1);
        }
        int tot = n/k;
        if(hm.size() == 1)return true;
        if(hm.size() == 2){
            for(int freq : hm.values()){
                if(freq == 1 || freq == tot - 1)return true;
            }
        }
        return false;
    }
}