// Last updated: 2/4/2026, 8:21:11 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0, org=x;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return org==rev?true:false;
    }
}