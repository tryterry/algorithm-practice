package study.d_250201;

import java.io.*;
import java.util.*;

public class b_1913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, target;

        n = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());
        // 1. 그래프 초기화
        int arr[][] = new int[n][n];

        int x = n / 2;
        int y = n / 2;

        int count = 1;

        arr[x][y] = count;

        int v = 0; // 방향
        int step = 1; // 증감 값
        int repeat = 0; // 두 번씩 반복
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while (x >= 0 && y >= 0) {
            for (int i = 0; i < step; i++) {
                count++;
                x += dx[v];
                y += dy[v];
                if (x < 0 || y < 0) break;
                arr[x][y] = count;
            }
            v = (v + 1) % 4; // step 만큼 이동이 끝나면 방향 전환
            repeat = (repeat + 1) % 2; // 반복 증가
            if (repeat == 0) step++; //  두번 반복이 끝나면 step 증가
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(target == arr[i][j]){
                    // target 값과 일치하는 x, y 좌표 저장
                    x = i+1;
                    y = j+1;
                }
                bw.write(String.valueOf(arr[i][j] + " ")); // 모든 좌표값 출력 (달팽이 모양 그리기)
            }
            bw.newLine();
        }

        // target의 좌표값 출력
        bw.write(String.valueOf(x + " " + y));


        br.close();
        bw.close();
    }

}

