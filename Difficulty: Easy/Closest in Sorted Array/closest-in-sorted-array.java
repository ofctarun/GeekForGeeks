class Solution {
    public static int findClosest(int[] arr, int k) {
        // code here
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == k)return arr[mid];
            else if(arr[mid] < k)low = mid + 1;
            else high = mid - 1;
        }
        if(high < 0)return arr[low];
        else if(low >= arr.length)return arr[high];
        if(Math.abs(arr[high] - k)<Math.abs(arr[low] - k))return arr[high];
        return arr[low];
    }
}
