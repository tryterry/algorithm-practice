package problemset.dfs;
import java.util.*;
import java.io.*;

public class Tree {

    static int MAX = 50 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static ArrayList<Integer> queue;
    static int N,M;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;

        boolean leaf = false;
        for(int i = 1; i <=N; i++){
            if(!visited[i] && graph[idx][i]){
                leaf = true;
                dfs(i);
            }
        }
        if(leaf){
            System.out.println(idx);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        queue = new ArrayList<>();

        for(int i = 0; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }


        while(!queue.isEmpty()){

        }

        dfs(1);
    }
}
