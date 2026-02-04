// Last updated: 2/4/2026, 8:20:40 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        while(n>=row){
            n-=row;
            row++;
        }return row-1;
    }
}