public class NumOfZigZagArrays {
    static final long MOD = 1_000_000_007L;
    long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {
                    if (B[k][j] == 0) continue;

                    C[i][j] =
                        (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    long[][] power(long[][] M, long p) {
        int n = M.length;

        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) res[i][i] = 1;

        while (p > 0) {
            if ((p & 1) == 1)
                res = multiply(res, M);

            M = multiply(M, M);
            p >>= 1;
        }
        return res;
    }

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int S = 2 * m;

        long[][] T = new long[S][S];

        for (int x = 0; x < m; x++) {

            // up[x] -> down[y]
            for (int y = x + 1; y < m; y++)
                T[m + x][y] = 1;

            // down[x] -> up[y]
            for (int y = 0; y < x; y++)
                T[x][m + y] = 1;
        }

        long[][] P = power(T, n - 1);

        long[] start = new long[S];
        for (int i = 0; i < S; i++) start[i] = 1;

        long ans = 0;

        for (int j = 0; j < S; j++) {
            long ways = 0;

            for (int i = 0; i < S; i++) {
                ways = (ways + start[i] * P[i][j]) % MOD;
            }

            ans = (ans + ways) % MOD;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        NumOfZigZagArrays obj = new NumOfZigZagArrays();

        System.out.println(obj.zigZagArrays(3, 4, 5)); // 2
        System.out.println(obj.zigZagArrays(3, 1, 3)); // 10
    }
}
    

