class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int i = 0, j = 0;
        while(j < arr.length) {
            if(j - i + 1 < k){
                if(arr[j] < 0)neg.add(arr[j]);
                j++;
            }
            else{
                if(arr[j] < 0)neg.add(arr[j]);
                if(neg.isEmpty())ans.add(0);
                else{
                    ans.add(neg.get(0));
                    if(arr[i] == neg.get(0))neg.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}