package dfs;

import java.util.*;
import java.io.*;

public class Q3 {

    static int MAX = 100000 + 10;
    static boolean[][] graph;
    static boolean[] visited;

    static int N,M;
    static List<Integer> answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer.add(idx);

        for(int i = 1; i <= N; i++){
            if(!visited[idx] && graph[idx][i])
                dfs(idx);
        }
    }

    public static void main(String[] args) throws IOException{
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new ArrayList<>();

        // 1. graph에 연결 정보 채우기

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        int x,y;
        for(int i= 1; i <= N; N++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs 호출
        dfs(1);
        // 3. 출력

        for(int i = 0; i < answer.size(); i++){
            bw.write(String.valueOf(answer.get(i)));
        }
        br.close();
        bw.close();

    }
}
