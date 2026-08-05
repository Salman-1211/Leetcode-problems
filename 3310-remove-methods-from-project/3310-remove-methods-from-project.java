class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
               // ── STEP 1: Build directed graph ──────────────────
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] inv : invocations)
            graph.get(inv[0]).add(inv[1]);

        // ── STEP 2: BFS from k — mark suspicious ──────────
        boolean[] suspicious = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        suspicious[k] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next : graph.get(curr)) {
                if (!suspicious[next]) {
                    suspicious[next] = true;
                    queue.add(next);
                }
            }
        }

        // ── STEP 3: Check if removal is safe ──────────────
        // If any safe method calls a suspicious method
        // → can't remove anything
        for (int[] inv : invocations) {
            if (!suspicious[inv[0]] && suspicious[inv[1]]) {
                // Dangerous edge found!
                List<Integer> all = new ArrayList<>();
                for (int i = 0; i < n; i++) all.add(i);
                return all;
            }
        }

        // ── STEP 4: Return non-suspicious methods ──────────
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i])
                result.add(i);
        }
        return result;
    }
}