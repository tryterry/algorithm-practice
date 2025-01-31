package problemset.dfs.companion;

import java.util.*;
import java.io.*;

public class Q11 {

    static int MAX = 50 + 10;

    static char[][] map;
    static boolean[][] visited;

    static int N, M;
    static int answer;

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        char c = map[y][x];
        if (c == '-' && map[y][x + 1] == '-' && !visited[y][x + 1])
            dfs(y, x + 1);
        else if (c == 'ㅣ' && map[y + 1][x] == 'ㅣ' && !visited[y + 1][x])
            dfs(y + 1, x);
    }

    public static void main(String[] args) throws IOException {
// 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[MAX][MAX];
        visited = new boolean[MAX][MAX];
        answer = 0;

        // 1. map 정보 반영

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                map[i][j] = st.nextToken().charAt(0);
            }
        }

        // 2. algorithm.dfs 호출
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        // 3. 출력

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }
}
