class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int low = 0, high = arr.length - 1, ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == 1){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}