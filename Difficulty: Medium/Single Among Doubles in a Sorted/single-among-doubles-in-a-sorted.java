// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        // Complete this function
        if(arr.length == 1)return arr[0];
        int ans = -1;
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i] != arr[i+1]){
                ans = arr[i];
                break;
            }
        }
        if(ans == -1)return arr[arr.length - 1];
        return ans;
    }
}