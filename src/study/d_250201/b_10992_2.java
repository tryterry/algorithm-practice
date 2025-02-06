package study.d_250201;

import java.io.*;

/**
 * 두 번째 풀이
 *    *
 *   * *
 *  *   *
 * *******
 */
public class b_10992_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - (i + 1); j++) bw.write(" ");
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) bw.write("*"); // 처음과 끝만 * 출력
                else bw.write(" ");
            }
            bw.newLine();
        }

        for (int i = 0; i < 2 * n - 1; i++) bw.write("*");

        br.close();
        bw.close();
    }
}
