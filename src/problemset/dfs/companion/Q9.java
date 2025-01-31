package problemset.dfs.companion;

import java.util.*;
import java.io.*;

public class Q9 {

    static int MAX = 1000 + 10;

    static boolean[][] map;
    static boolean[][] visited;

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    static int N, M;

    static boolean answer;
    public static void dfs(int y, int x) {
        if(y == N){
            answer = true;
            return;
        }
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (!visited[newY][newX] && map[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
//

        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];

        // 1. map 정보 반영
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = (str.charAt(j - 1) == '0') ? true : false;
            }
        }

        // 2. algorithm.dfs 호출
        for (int j = 1; j <= M; j++) {
            if (map[1][j])
                dfs(1, j);
        }

        // 3. 출력
        if(answer== true) bw.write("YES");
        else bw.write("NO");

        br.close();
        bw.close();
    }
}
