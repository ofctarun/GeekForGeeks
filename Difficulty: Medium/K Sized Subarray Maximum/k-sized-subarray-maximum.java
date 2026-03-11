class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int i = 0, j = 0;
        while(j < arr.length){
            if(dq.size() == 0)dq.add(arr[j]);
            else{
                while(dq.size() > 0 && dq.peekLast() < arr[j]){
                    dq.removeLast();
                }
                dq.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else{
                ans.add(dq.peek());
                if(arr[i] == dq.peek())dq.removeFirst();
                i++;
                j++;
            }
        }
        return ans;
    }
}