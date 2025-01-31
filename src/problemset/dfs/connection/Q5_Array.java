package problemset.dfs.connection;

import java.util.*;
import java.io.*;


public class Q5_Array {

    static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, V;
    static ArrayList<Integer> queue;

    public static void dfs(int idx) {
        visited[idx] = true;
        System.out.println(idx + " ");
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i] == true) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.println(idx + " ");

            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[idx][i] == true) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 1. graph 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }
        // 2. algorithm.dfs 재귀함수 호출
        dfs(V);
        System.out.println();

        // 3. bfs
        bfs();
    }
}
