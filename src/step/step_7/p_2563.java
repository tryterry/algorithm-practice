package step.step_7;

import java.io.*;
import java.util.*;

public class p_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            for (int j = y[i]; j < y[i] + 10; j++) {
                for (int k = x[i]; k < x[i] + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) sum++;
            }
        }

        bw.write(sum+"");

        br.close();
        bw.close();

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else
            return a;
    }
}
