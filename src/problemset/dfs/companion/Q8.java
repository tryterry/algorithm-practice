package problemset.dfs.companion;

import java.util.*;
import java.io.*;

/**
 * 유기농 배추
 * 백준 1012(실버3)
 * DFS - 같은 부류 찾기
 */
public class Q8 {

    static int MAX = 50 + 10;
    static boolean[][] map;

    static int N, M, T, K;

    static int dirY[] = {-1, 1, 0, 0};
    static int dirX[] = {0, 0, -1, 1};


    static void dfs(int y, int x) {
        map[y][x] = false;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x+ dirX[i];
            if(map[newY][newX]){
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];

            // 1. map 정보 반영
            int x, y;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                map[y + 1][x + 1] = true;
            }

            // 2. algorithm.dfs 수행
            int answer = 0;
            for (int i = 1; i <= N; i++)
                for (int j = 1; j <= N; j++) {
                    if (map[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }

            // 3. 출력
            bw.write(String.valueOf(answer));
            bw.newLine();


        }
        br.close();
        bw.close();

    }
}
