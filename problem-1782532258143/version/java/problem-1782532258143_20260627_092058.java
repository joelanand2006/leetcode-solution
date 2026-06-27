// Last updated: 6/27/2026, 9:20:58 AM
1class Solution {
2    public int maxDistance(String moves) {
3        int x = 0;
4        int y = 0;
5        int wildcards = 0;
6        
7        for (char c : moves.toCharArray()) {
8            if (c == 'U') {
9                x++;
10            } else if (c == 'D') {
11                x--;
12            } else if (c == 'R') {
13                y++;
14            } else if (c == 'L') {
15                y--;
16            } else if (c == '_') {
17                wildcards++;
18            }
19        }
20        
21        return Math.abs(x) + Math.abs(y) + wildcards;
22    }
23}