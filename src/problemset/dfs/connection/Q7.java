package problemset.dfs.connection;

import java.util.*;
import java.io.*;

public class Q7 {

    static int MAX = 100000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static int N, M;

    static int[] answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (!visited[next]) {
                answer[next] = idx;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 0. 입력 및 초기화

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        // 1. graph 연결 정보 채우기
        graph = new ArrayList[MAX];
        visited = new boolean[MAX];
        answer = new int[MAX];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 2. 오름차순 정렬

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 3. algorithm.dfs 재귀함수 호출

        dfs(1);

        // 4. 출력
        for (int i = 2; i <= N; i++) {
            String value = String.valueOf(answer[i]);
            bw.write(value);
        }

        br.close();
        bw.close();
    }
}
