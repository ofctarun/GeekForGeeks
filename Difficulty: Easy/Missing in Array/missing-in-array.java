class Solution {
	int missingNum(int arr[]) {
		// code here
	    int n = arr.length + 1;
        int xorSum = 0;
        for(int i = 1; i <= n; ++i){
            xorSum ^= i;
        }
        for (int num : arr) {
            xorSum ^= num;
        }
        return xorSum;
	}
}
