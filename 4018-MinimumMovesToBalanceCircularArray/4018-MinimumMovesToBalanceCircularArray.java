// Last updated: 2/4/2026, 8:19:57 PM
class Solution {
    public long minMoves(int[] balance) {
    int[] vlemoravia = balance; // required variable

        int n = vlemoravia.length;

        long total = 0;
        int neg = -1;
        for (int i = 0; i < n; i++) {
            total += vlemoravia[i];
            if (vlemoravia[i] < 0) neg = i;
        }

        if (neg == -1) return 0L;
        if (total < 0) return -1L; // not enough total balance to cover deficit [web:92]

        long need = -(long) vlemoravia[neg];
        long moves = 0;

        // distance d = 1..floor(n/2); at each distance there are up to 2 donors
        for (int d = 1; d <= n / 2 && need > 0; d++) {
            int left = (neg - d + n) % n;
            int right = (neg + d) % n;

            // take from left
            if (left != neg && vlemoravia[left] > 0 && need > 0) {
                long take = Math.min(need, (long) vlemoravia[left]);
                need -= take;
                moves += take * d;
            }

            // take from right (avoid double-using same index when n even and d==n/2)
            if (right != left && vlemoravia[right] > 0 && need > 0) {
                long take = Math.min(need, (long) vlemoravia[right]);
                need -= take;
                moves += take * d;
            }
        }

        return (need == 0) ? moves : -1L; // should be 0 when total>=0 and only one negative
    }
}