// Last updated: 2/4/2026, 8:19:55 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums); // needed to make first k = smallest, last k = largest [web:57]

        int n = nums.length;
        int smallestSum = 0, largestSum = 0;

        for (int i = 0; i < k; i++) {
            smallestSum += nums[i];
            largestSum += nums[n - 1 - i];
        }
        return Math.abs(largestSum - smallestSum);
    }
}