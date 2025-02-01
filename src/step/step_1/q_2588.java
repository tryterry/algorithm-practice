package step.step_1;

import java.io.*;
import java.util.*;

/**
 * 문제 번호: 2588
 * 문제 이름: 곱셈
 */
public class q_2588 {
    public static void main(String[] args) throws IOException {
        int a, b1, b10, b100, r1, r2, r3;
        String b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // given
        a = Integer.parseInt(br.readLine()); // 곱해지는 수
        b = br.readLine(); // 곱하는 수

        // when

        // 곱하는 수의 분리
        b1 = Character.getNumericValue(b.charAt(2));
        b10 = Character.getNumericValue(b.charAt(1));
        b100 = Character.getNumericValue(b.charAt(0));
        // 1. 1의 자리 수 곱한 결과
        r1 = a * b1;
        // 2. 10의 자리 수 곱한 결과
        r2 = a * b10;
        // 3. 100의 자리 수 곱한 결과
        r3 = a * b100;

        // then
        bw.write(String.valueOf(r1));
        bw.newLine();
        bw.write(String.valueOf(r2));
        bw.newLine();
        bw.write(String.valueOf(r3));
        bw.newLine();
        bw.write(String.valueOf(r1 + (r2 * 10) + (r3 * 100)));
        bw.newLine();

        br.close();
        bw.close();
    }
}
