class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0], max = arr[0];
        for(int x : arr){
            if(x < min)min = x;
            if(x > max)max = x;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(min); al.add(max);
        return al;
    }
}
