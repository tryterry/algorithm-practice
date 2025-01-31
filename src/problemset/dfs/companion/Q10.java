package problemset.dfs.companion;

import java.util.*;
import java.io.*;

public class Q10 {

    static int MAX = 50 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirY = {-1, -1, -1, 0, 0, 1, 1, 1,};
    static int[] dirX = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int N, M;

    static int count;

    public static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int i = 0; i < 8; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX] && !visited[newY][newX])
                dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];
        count = 0;

        // 1. map 정보 반영
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = str.charAt(j - 1) == '1';
            }
        }

        // 2. algorithm.dfs 함수 호출
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (map[i][j] && !visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }
        }

        // 3. 출력
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
