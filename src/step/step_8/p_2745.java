package step.step_8;

import java.util.*;
import java.io.*;

/**
 * Math.pow(n,b) = n의 b 제곱
 *
 * '0' ~ '9' : 48 ~ 57
 * 'A' ~ 'Z' : 65 ~ 90
 */
public class p_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken()); // B진법

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int step = (n.length() - i - 1); // 자리 수
            int c = n.charAt(i); // i 번째 문자
            if (c >= '0' && c <= '9') { // 숫자인 경우
                sum += (c - 48) * (Math.pow(b, step));
            } else { // 문자인 경우
                sum += (c - 55) * (Math.pow(b, step));
            }
        }
        bw.write(sum + "");
        br.close();
        bw.close();
    }
}
