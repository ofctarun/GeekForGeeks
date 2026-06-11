class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        HashMap<Integer , Integer> hm = new HashMap<>();
        int ans = 0, i = 0;
        for(int j = 0; j < arr.length; j++){
            hm.put(arr[j] , hm.getOrDefault(arr[j],0) + 1);
            if(hm.get(arr[j]) == 1)k--;
            while(k < 0){
                hm.put(arr[i],hm.get(arr[i]) - 1);
                if(hm.get(arr[i]) == 0)k++;
                i++;
            }
            ans += j - i + 1;
        }
        return ans;
    }
}
