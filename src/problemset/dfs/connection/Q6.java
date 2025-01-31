package problemset.dfs.connection;

import java.util.*;
import java.io.*;

/**
 * 백준 2644(실버2)
 * DFS - 연결된 요소 찾기 유형
 */
public class Q6 {

    static int MAX = 100 + 10;
    static boolean[][] graph;
    static boolean[] visited;

    static int N,M, start, end;
    static int answer;

    public static void dfs(int idx, int count){
        visited[idx] = true;
        if(idx == end) {
            answer = count;
            return;
        }


        for(int i = 1; i <= N; i++){
            if(!visited[i] && graph[idx][i])
                dfs(i, count + 1);
        }

    }

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. graph 연결 정보 채우기

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         start = Integer.parseInt(st.nextToken());
         end = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = -1;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. 오름차순 정렬


        // 3. algorithm.dfs 재귀함수 호출
        dfs(start, 0);

        // 4. 춮력

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();


    }
}
