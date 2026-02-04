// Last updated: 2/4/2026, 8:20:39 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int count=0;
        while(res!=0)
        {
            int rsb=res&-res;
            res-=rsb;
            count++;
        }
        return count;
        
    }
}