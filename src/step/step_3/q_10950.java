package step.step_3;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10950
 * 문제 이름: A+B-3
 */
public class q_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        int n = Integer.parseInt(br.readLine());
        //given
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }

        //when

        //then

        br.close();
        bw.close();
    }
}
