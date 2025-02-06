package study.d_250201;

import java.util.*;
import java.io.*;

public class b_1913_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];


        // when
        int count = 1;

        int half = n / 2;
        int step = 2;

        int x = half;
        int y = half;
        arr[half][half] = count;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int[] vx = {1, 0, -1, 0};
        int[] vy = {0, -1, 0, 0};
        int v = 0; // 0, 1, 2, 3

        for (int i = 0; i < half; i++) {
            x = half - i - 1;
            y = half - i;
            for (int j = 0; j < 4; j++) { // 상, 우, 하, 좌 (4번 반복)
                for (int k = 0; k < step; k++) {
                    arr[x][y] = ++count;
                    if (k == (step - 1)) { // step의 마지막은 방향 전환
                        x += vx[v];
                        y += vy[v];
                    } else { // 직선 이동
                        x += dx[v];
                        y += dy[v];
                    }
                }
                v = (v + 1) % 4; // step 끝나면 방향 전환
            }
            step += 2; // 네 바퀴 다돌면 step 증가
        }


        //then
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j] + " ");
                if (arr[i][j] == m) {
                    x = i + 1;
                    y = j + 1;
                }
            }
            bw.newLine();
        }

        bw.write(x + " " + y);
        br.close();
        bw.close();
    }
}
