class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        for(int i=0;i<seats.length-1;i++)if(seats[i] == 1 && seats[i + 1] == 1)return false;
        int placed = 0;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 0){
                boolean leftEmpty = (i == 0) || seats[i - 1] == 0;
                boolean rightEmpty = (i == seats.length - 1) || seats[i + 1] == 0;
                if(leftEmpty && rightEmpty){
                    seats[i] = 1;
                    placed++;
                    if(placed >= k)return true;
                }
            }
        }
        return placed >= k;
    }
}