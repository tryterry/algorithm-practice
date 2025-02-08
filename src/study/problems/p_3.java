package study.problems;

import java.util.*;
import java.io.*;

public class p_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n, m;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        //when
        //배열 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] reverse = new int[m][n]; // 회전 배열
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverse[j][n - 1 - i] = arr[i][j]; // 90도 회전
            }
        }

        //then
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(reverse[i][j] + " ");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}

