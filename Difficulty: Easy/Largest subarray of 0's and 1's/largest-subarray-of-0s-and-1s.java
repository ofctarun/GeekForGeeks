class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int prefixSum = 0, ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum += (arr[i]==0)?-1:1;
            if(prefixSum == 0)ans = i+1;
            else if(hm.containsKey(prefixSum))ans=Math.max(ans,i-hm.get(prefixSum));
            if(!hm.containsKey(prefixSum))hm.put(prefixSum,i);
        }
        return ans;
    }
}