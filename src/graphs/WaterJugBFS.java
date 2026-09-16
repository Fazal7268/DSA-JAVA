package graphs;

import java.util.*;

public class WaterJugBFS {
    private static long pack(int x, int y) {
        return ((long) x << 32) | (y & 0xFFFFFFFFL);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static List<String> solve(int c1, int c2, int target) {
        if (target > Math.max(c1, c2) || target % gcd(c1, c2) != 0) return null;

        Queue<int[]> q = new ArrayDeque<>();
        Queue<List<String>> paths = new ArrayDeque<>();
        Set<Long> visited = new HashSet<>();

        q.add(new int[]{0, 0});
        paths.add(List.of("(0, 0)"));
        visited.add(pack(0, 0));

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            List<String> path = paths.poll();
            int x = curr[0], y = curr[1];

            if (x == target || y == target) return path;

            int[][] next = {
                    {c1, y}, {x, c2}, {0, y}, {x, 0},
                    {x - Math.min(x, c2 - y), y + Math.min(x, c2 - y)},
                    {x + Math.min(y, c1 - x), y - Math.min(y, c1 - x)}
            };

            for (int[] state : next) {
                if (visited.add(pack(state[0], state[1]))) {
                    q.add(state);
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add("(" + state[0] + ", " + state[1] + ")");
                    paths.add(newPath);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<String> path = solve(4, 3, 2);
        System.out.println(path != null ? String.join(" -> ", path) : "No solution");
    }
}