package step.step_1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 번호: 10869
 * 문제 이름: 사칙연산
 */

public class q_10869 {

    public static void main(String[] args) throws IOException{

        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        // A+B
        bw.write(String.valueOf(a + b));
        bw.newLine();
        // A-B
        bw.write(String.valueOf(a - b));
        bw.newLine();
        // A*B
        bw.write(String.valueOf(a * b));
        bw.newLine();
        // A/B
        bw.write(String.valueOf(a / b));
        bw.newLine();
        // A%B
        bw.write(String.valueOf(a % b));
        bw.newLine();

        br.close();
        bw.close();
    }
}
