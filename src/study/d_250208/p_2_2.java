package study.d_250208;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2번 문제 다른 풀이
 */
public class p_2_2 {
    public static int abs(int a) {
        if (a >= 0) return a;
        else return -a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, k;
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()); // 타겟 점수

        st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            int temp = sum + a;

            if (temp > k) {
                if (abs(temp - k) > abs(sum - k)) {
                    bw.write(sum + "");
                } else
                    bw.write(temp + "");
                break;
            }
            sum = temp;
        }
        br.close();
        bw.close();

    }
}
