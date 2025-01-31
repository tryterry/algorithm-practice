package problemset.dfs_practice;

import java.io.*;
import java.util.*;

public class Q6_family {

    static int max = 100 + 10;
    static boolean[][] graph;
    static boolean[] visited;

    static int N, M, start, end;

    static int answer;

    public static void dfs(int idx, int num) {
        if(idx == end){
            answer = num;
        }
        visited[idx] = true;

        for(int i = 1; i<=N; i++){
            if(!visited[i] && graph[idx][i]){
                dfs(i, num + 1);

            }
        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[max][max];
        visited = new boolean[max];
        answer = -1;

        for(int i = 0; i <M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(start, 0);

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }

}
