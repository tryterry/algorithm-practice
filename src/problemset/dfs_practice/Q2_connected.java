package problemset.dfs_practice;

import java.util.*;
import java.io.*;

public class Q2_connected {

    static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;

        for(int i = 1; i<=N; i++){
            if(!visited[i] && graph[idx][i])
                dfs(i);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = 0;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        for(int i = 1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
