package study.d_250208;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 4번 문제 다른 풀이
 */
public class p_4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, k;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        // 배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < k; i++) max += arr[i];

        int nextSum = max;
        for (int i = 1; i < n - k; i++) {
            nextSum = nextSum - arr[i - 1] + arr[i + k - 1];
            if (nextSum > max) max = nextSum;
        }
        bw.write(max + "");

        bw.close();
        br.close();
    }
}
