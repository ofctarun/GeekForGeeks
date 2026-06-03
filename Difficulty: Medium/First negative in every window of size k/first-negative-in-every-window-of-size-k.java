class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,j = 0;
        while(j < arr.length){
            if(arr[j] < 0)neg.add(arr[j]);
            if(j- i + 1 < k){
                j++;
            }
            else{
                if(neg.isEmpty())ans.add(0);
                else{
                    ans.add(neg.get(0));
                    if(neg.get(0) == arr[i])neg.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}