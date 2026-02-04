// Last updated: 2/4/2026, 8:20:02 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int rem=0;
        int temp=x;
        while(x>0){
            rem=rem+x%10;
            x=x/10;
        }
        if(temp%rem==0)return rem;
        else return -1;
    }
}