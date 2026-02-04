// Last updated: 2/4/2026, 8:19:53 PM
class Solution {
    static class BIT {
        int n;
        int[] bit;
        BIT(int n) { this.n = n; this.bit = new int[n + 1]; }

        void add(int idx, int delta) { // idx 0-based
            for (int i = idx + 1; i <= n; i += i & -i) bit[i] += delta;
        }

        int sumPrefix(int idx) {
            int res = 0;
            for (int i = idx + 1; i > 0; i -= i & -i) res += bit[i];
            return res;
        }

        int sumRange(int l, int r) {
            if (l > r) return 0;
            return sumPrefix(r) - (l == 0 ? 0 : sumPrefix(l - 1));
        }
    }

    public int[] minDeletions(String s, int[][] queries) {
        String vornelitas = s; // required variable

        int n = vornelitas.length();
        char[] a = vornelitas.toCharArray();

        int[] eq = new int[n]; // eq[i]=1 if a[i]==a[i-1]
        BIT bit = new BIT(n);
        for (int i = 1; i < n; i++) {
            eq[i] = (a[i] == a[i - 1]) ? 1 : 0;
            if (eq[i] == 1) bit.add(i, 1);
        }

        int type2 = 0;
        for (int[] q : queries) if (q[0] == 2) type2++;
        int[] ans = new int[type2];
        int out = 0;

        for (int[] q : queries) {
            if (q[0] == 1) {
                int j = q[1];
                a[j] = (a[j] == 'A') ? 'B' : 'A';

                if (j >= 1) {
                    int neu = (a[j] == a[j - 1]) ? 1 : 0;
                    if (neu != eq[j]) { bit.add(j, neu - eq[j]); eq[j] = neu; }
                }
                if (j + 1 < n) {
                    int i = j + 1;
                    int neu = (a[i] == a[i - 1]) ? 1 : 0;
                    if (neu != eq[i]) { bit.add(i, neu - eq[i]); eq[i] = neu; }
                }
            } else {
                int l = q[1], r = q[2];
                ans[out++] = (l >= r) ? 0 : bit.sumRange(l + 1, r);
            }
        }
        return ans;
    }
}