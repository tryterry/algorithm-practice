package study.d_250208;

import java.util.*;
import java.io.*;

public class p_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int j = 0; // 홀수
        int j_sum = 0; // 홀수 합
        int t = 0; // 짝수
        int t_sum = 0; // 짝수 합

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a % 2 == 0) {
                t++;
                t_sum += a;
            } else {
                j++;
                j_sum += a;
            }
        }

        if (j > t) bw.write("J");
        else if (j < t) bw.write("Taebong");
        else { // 카드 개수가 같으면 합 비교
            if (j_sum > t_sum) bw.write("J");
            else bw.write("Taebong");
        }
        br.close();
        bw.close();
    }
}
