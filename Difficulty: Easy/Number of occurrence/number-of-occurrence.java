class Solution {
    int binarySearch(int[] arr, int target, boolean isFirst){
        int low = 0, high = arr.length - 1,ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < target)low = mid + 1;
            else if(arr[mid] > target)high = mid - 1;
            else{
                ans = mid;
                if(isFirst)high = mid - 1;
                else low = mid + 1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int high = binarySearch(arr, target, false), low = binarySearch(arr, target, true);
        if(low == -1)return 0;
        return high - low + 1;
    }
}
