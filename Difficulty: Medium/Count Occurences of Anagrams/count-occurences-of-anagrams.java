// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int freq[] = new int[26];
        int unq = 0,ans = 0;
        for(char ch : pat.toCharArray()){
            if(freq[ch - 'a'] == 0)unq++;
            freq[ch - 'a']--;
        }
        int i = 0,j = 0;
        int n = txt.length(), k = pat.length();
        while(j < n){
            int curr = txt.charAt(j) - 'a';
            if(freq[curr] == 0)unq++;
            freq[curr]++;
            if(freq[curr] == 0)unq--;
            if(j - i + 1 < k){
                j++;
            }
            else{
                if(unq == 0)ans++;
                int cur = txt.charAt(i) - 'a';
                if(freq[cur] == 0)unq++;
                freq[cur]--;
                if(freq[cur] == 0)unq--;
                i++;
                j++;
            }
        }
        return ans;
    }
}