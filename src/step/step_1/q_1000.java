package step.step_1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 번호: 1000
 * 문제 이름: A+B
 */

public class q_1000 {
    public static void main(String[] args) throws IOException {
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(a + b));
        br.close();
        bw.close();

    }
}
