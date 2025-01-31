package problemset.dfs_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Q3_dfs_2 {

    static int MAX = 100000+ 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, R;
    static int order;
    static int[] answer;
    public static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order;
        order++;
        for(int i = 0; i < graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(!visited[next]){
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[MAX];
        for(int i = 1; i <=N; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        order = 1;
        answer = new int[N+1];

        int u,v;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 오름차순 정렬
        for(int i = 1; i <=N; i++){
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        dfs(R);

        for(int i = 1; i < N+1;i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }



        br.close();
        bw.close();
    }
}
