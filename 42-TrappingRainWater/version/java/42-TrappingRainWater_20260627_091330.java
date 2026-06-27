// Last updated: 6/27/2026, 9:13:30 AM
1class Solution {
2    public int trap(int[] height) {
3        if (height == null || height.length == 0) {
4            return 0;
5        }
6        
7        int left = 0;
8        int right = height.length - 1;
9        int leftMax = height[left];
10        int rightMax = height[right];
11        int water = 0;
12        
13        while (left < right) {
14            if (leftMax < rightMax) {
15                left++;
16                leftMax = Math.max(leftMax, height[left]);
17                water += leftMax - height[left];
18            } else {
19                right--;
20                rightMax = Math.max(rightMax, height[right]);
21                water += rightMax - height[right];
22            }
23        }
24        
25        return water;
26    }
27}