// Last updated: 2/4/2026, 8:20:51 PM
class Solution {
    public int addDigits(int num) {
        if(num>=0 && num<=9){
            return num;
        }else{
            if(num%9==0){
                return 9;
            }
            return num%9;
        }
        
    }
}