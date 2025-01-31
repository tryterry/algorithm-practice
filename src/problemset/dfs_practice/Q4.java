package problemset.dfs_practice;

import java.util.*;
import java.io.*;

public class Q4 {

    static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M,V;
    static ArrayList<Integer> answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer.add(idx);

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
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

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = new ArrayList<>();

        // 1. graph 연결 정보 채우기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][y] = true;
        }
        // 2. algorithm.dfs 재귀함수 호출
        dfs(1);


        // 4. 종료
        for(int i = 0; i < answer.size(); i++){
            bw.write(String.valueOf(answer.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}
