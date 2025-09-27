// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int prefixSum = 0,ans=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(prefixSum==k)ans = i+1;
            else if(hm.containsKey(prefixSum-k)){
                ans = Math.max(ans,i-hm.get(prefixSum-k));
            }
            if(!hm.containsKey(prefixSum))hm.put(prefixSum,i);
        }
        return ans;
    }
}
