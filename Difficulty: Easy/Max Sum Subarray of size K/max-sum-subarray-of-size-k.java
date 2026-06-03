class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0, j = 0,sum = 0, ans  = Integer.MIN_VALUE, n = arr.length;
        while (j < n){
            if(j - i + 1 < k){
                sum += arr[j];
                j++;
            }
            else{
                sum += arr[j];
                ans = Math.max(sum , ans);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}