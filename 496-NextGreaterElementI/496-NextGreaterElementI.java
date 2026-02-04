// Last updated: 2/4/2026, 8:20:38 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] next = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            next[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(num);
        }
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (nums2[j] == target) {
                    idx = j;
                    break;
                }
            }

            result[i] = next[idx];
        }

        return result;
    }
}