package problemset.dfs.companion;

import java.util.*;
import java.io.*;


public class Q12 {

    static int MAX = 3 + 1;
    static int[][] map;
    static boolean[][] visited;

    static int N;

    static boolean answer;

    public static void dfs(int y, int x) {
        int jump = map[y][x];
        if(y+jump == N && x+jump ==N){
            answer = true;
            return;
        }

        visited[y][x] = true;
        if(y+jump < N && !visited[y][x]) dfs(y + jump, x);
        if(x+jump < N && !visited[y][x]) dfs(y, x + jump);
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];
        answer = false;

        for(int i = 1; i <=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                int v = Integer.parseInt(st.nextToken());
                map[i][j] = v;
            }
        }

        dfs(1, 1);

        if(answer){
            bw.write("HaruHaru");
        }else{
            bw.write("Hing");
        }

        br.close();
        bw.close();

    }
}
