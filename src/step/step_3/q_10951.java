package step.step_3;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10951
 * 문제 이름: A+B - 4
 */
public class q_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        //given
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(!st.hasMoreTokens())
                break;
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
