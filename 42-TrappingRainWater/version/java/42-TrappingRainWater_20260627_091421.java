// Last updated: 6/27/2026, 9:14:21 AM
1import java.util.Deque;
2import java.util.LinkedList;
3
4class Solution {
5    public int[] maxSlidingWindow(int[] nums, int k) {
6        if (nums == null || nums.length == 0) {
7            return new int[0];
8        }
9        
10        int n = nums.length;
11        int[] result = new int[n - k + 1];
12        int ri = 0;
13        Deque<Integer> q = new LinkedList<>();
14        
15        for (int i = 0; i < n; i++) {
16            if (!q.isEmpty() && q.peek() < i - k + 1) {
17                q.poll();
18            }
19            
20            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
21                q.pollLast();
22            }
23            
24            q.offer(i);
25            
26            if (i >= k - 1) {
27                result[ri++] = nums[q.peek()];
28            }
29        }
30        
31        return result;
32    }
33}