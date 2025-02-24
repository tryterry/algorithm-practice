package step.step_7;

import java.io.*;
import java.util.*;

/**
 * 최댓값
 */
public class p_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = 9;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    y = i;
                    x = j;
                }
            }
        }

        bw.write(max + "\n");
        bw.write((y+1) + " " + (x+1));
        br.close();
        bw.close();
    }
}
