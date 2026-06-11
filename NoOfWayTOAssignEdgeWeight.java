import java.util.*;
public class NoOfWayTOAssignEdgeWeight {
    static final long MOD = 1_000_000_007L;
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];
        q.offer(1);
        vis[1] = true;
        int depth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int node = q.poll();
                for (int nei : graph[node]) {
                    if (!vis[nei]) {
                        vis[nei] = true;
                        q.offer(nei);
                    }
                }
            }
            if (!q.isEmpty()) depth++;
        }
        return (int) modPow(2, depth - 1 >= 0 ? depth - 1 : 0);
    }
    private long modPow(long base, long exp) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        NoOfWayTOAssignEdgeWeight sol = new NoOfWayTOAssignEdgeWeight();
        int[][] edges1 = {{1, 2}};
        System.out.println("Output 1: " + sol.assignEdgeWeights(edges1));
        int[][] edges2 = {
            {1, 2},
            {1, 3},
            {3, 4},
            {3, 5}
        };
        System.out.println("Output 2: " + sol.assignEdgeWeights(edges2));
    }
}

