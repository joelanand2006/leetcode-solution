// Last updated: 2/4/2026, 8:20:27 PM
class Solution {
    public int countOdds(int low, int high) {
        int range=(high-low+1);
        if(low%2==1 && high%2==1) return (range/2)+1;
        else return range/2;
    }
}