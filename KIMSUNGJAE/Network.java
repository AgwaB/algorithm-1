public class Network {
    private static boolean[] visited;
    private static int depth = 0;
    public static void main (String[] args) {
        int answer = 0;
        int n;
        int[][] computers;

        // example 1
        n = 3;
        computers = new int[][]{
                {1,1,0},
                {1,1,1},
                {0,1,1}
        };

        visited = new boolean[n];

        for(int i = 0 ; i < n ; i ++) {
            depth = 0;
            dfs(computers, i);

            if (depth > 0 ){
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void dfs(int[][] map, int start) {
        if (visited[start]) {
            return;
        }
        depth++;
        visited[start] = true;

        for (int i = 0 ; i < map.length ; i ++) {
            if(map[start][i] == 1 && !visited[i]) {
                dfs(map, i);
            }
        }
    }
}
