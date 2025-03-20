class Solution {
    int[] parent, minCost;

    private int find(int node) {
        if (parent[node] < 0) return node;
        return parent[node] = find(parent[node]);
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        parent = new int[n];
        minCost = new int[n];
        Arrays.fill(parent, -1);
        Arrays.fill(minCost, -1);

        for (int[] edge : edges) {
            int uRoot = find(edge[0]), vRoot = find(edge[1]);
            if (uRoot != vRoot) {
                minCost[uRoot] &= minCost[vRoot];
                parent[vRoot] = uRoot;
            }
            minCost[uRoot] &= edge[2];
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int u = query[i][0], v = query[i][1];
            int uRoot = find(u), vRoot = find(v);

            if (u == v) result[i] = 0;
            else if (uRoot != vRoot) result[i] = -1;
            else result[i] = minCost[uRoot];
        }

        return result;
    }
}
