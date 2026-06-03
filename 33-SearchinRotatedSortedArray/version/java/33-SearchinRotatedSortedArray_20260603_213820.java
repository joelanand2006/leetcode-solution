// Last updated: 6/3/2026, 9:38:20 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = (left + right) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            } else if (nums[mid] >= nums[left]) {
12                if (nums[left] <= target && target <= nums[mid]) {
13                    right = mid - 1;
14                } else {
15                    left = mid + 1;
16                }
17            } else {
18                if (nums[mid] <= target && target <= nums[right]) {
19                    left = mid + 1;
20                } else {
21                    right = mid - 1;
22                }
23            }
24        }
25
26        return -1;        
27    }
28}