class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            hm.putIfAbsent(arr[i],new ArrayList<>());
            hm.get(arr[i]).add(i);
        }
        
        for(int[] q : queries){
            int st = q[0],end = q[1],target = q[2];
            if(!hm.containsKey(target) || hm.get(target).get(0) > end)ans.add(0);
            else ans.add(bs(hm.get(target),end + 1) - bs(hm.get(target),st));
        }
        
        return ans;
    }
    int bs(ArrayList<Integer> ls,int target){
        int low = 0,high = ls.size();
        
        while(low < high){
            int mid = low + (high - low)/2;
            if(ls.get(mid) < target)low = mid + 1;
            else high = mid;
        }
        
        return high;
    }
}