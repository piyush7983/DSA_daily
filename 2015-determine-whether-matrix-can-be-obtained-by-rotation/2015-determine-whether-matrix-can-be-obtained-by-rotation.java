class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    private boolean check(int[][] m, int[][] t) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] != t[i][j]) return false;
            }
        }
        return true;
    }

    private void rotate(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int tmp = m[i][l];
                m[i][l] = m[i][r];
                m[i][r] = tmp;
                l++;
                r--;
            }
        }
    }
}