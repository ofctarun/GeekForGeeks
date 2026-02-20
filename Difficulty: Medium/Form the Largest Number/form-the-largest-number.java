class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] ar = new String[arr.length];
        for(int i = 0; i < arr.length; i++)ar[i] = String.valueOf(arr[i]);
        Arrays.sort(ar, (a, b) -> (b + a).compareTo(a + b));
        if(ar[0].equals("0"))return "0";
        return Arrays.toString(ar).replace("[","").replace("]","").replace(",","").replace(" ","");
    }
}