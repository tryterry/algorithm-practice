package step.step_3;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 11022
 * 문제 이름: A+B - 8
 */
public class q_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int t = Integer.parseInt(br.readLine());
        int[] a = new int[t];
        int[] b = new int[t];
        //when
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        //then
        for (int i = 0; i < t; i++) {
            bw.write("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + (a[i] + b[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
