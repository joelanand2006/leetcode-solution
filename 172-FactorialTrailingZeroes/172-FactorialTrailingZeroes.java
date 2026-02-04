// Last updated: 2/4/2026, 8:20:59 PM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while (n>=5){
            c+=n/5;
            n/=5;

        }return c;
    }
}