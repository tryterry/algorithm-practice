package problemset.dfs.connection;

import java.util.*;
import java.io.*;


/**
 * 바이러스
 * 백준 2606(실버 3)
 * DFS - 연결된 요소 찾기 유형
 */
public class Q1 {

    static boolean[][] graph;
    static boolean[] visited;

    static int N;
    static int M;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        answer++;

        for(int i = 1; i <=N; i ++){
            if(!visited[i] && graph[idx][i])
            dfs(i);
        }
    }

    public static void main(String args[]) throws IOException{
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        // 1. graph에 연결 정보 채우기
        int x, y;

        for(int i = 0; i< M; M ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. algorithm.dfs(재귀함수) 호출
        dfs(1);

        // 3. 출력

        bw.write(String.valueOf(answer - 1));
        bw.close();
        br.close();
    }

}
