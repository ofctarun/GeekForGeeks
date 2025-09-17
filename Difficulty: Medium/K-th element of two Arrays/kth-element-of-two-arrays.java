class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i = 0,j = 0,idx = 0;
        while(i < a.length && j < b.length){
            if(a[i] > b[j]){
                j++;
                idx++;
                if(idx == k)return b[j-1];
            }
            else{
                i++;
                idx++;
                if(idx == k)return a[i-1];
            }
        }
        while(i < a.length){
            i++;
            idx++;
            if(idx == k)return a[i-1];
        }
        while(j < b.length){
            j++;
            idx++;
            if(idx == k)return b[j-1];
        }
        return -1;
    }
}