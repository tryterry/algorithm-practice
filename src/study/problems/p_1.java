package study.problems;

import java.util.*;
import java.io.*;

public class p_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];


        //when
        // 배열 초기화
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //then
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i]; // '\' 대각선 요소 합
            if (i != (n - 1 - i)) // 겹치는 요소 제외
                sum += arr[i][n - 1 - i]; // '/' 대각선 요소 합
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
