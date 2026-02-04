// Last updated: 2/4/2026, 8:19:54 PM
class Solution {
    public boolean canAliceWin(int[] nums) {

        int n = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] <=  9) {
                n += nums[i];
            }
            else {
                sum += nums[i]; 
            }
            
        }
        if(sum == n) {
            return false;
        }
        return true;
    }
}