package study.d_250206;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2번 문제 다른 풀이
 * 스왑 하지 않고 순서만 바꿔서 출력
 */

public class p_2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];


        // 배열 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                bw.write(String.valueOf(arr[i][j] + " "));
            }
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
