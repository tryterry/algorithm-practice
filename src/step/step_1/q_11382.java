package step.step_1;

import java.io.*;
import java.util.*;

/**
 * 문제 번호: 11382
 * 문제 이름: 꼬마 정민
 */
public class q_11382 {
    public static void main(String[] args) throws IOException {
        long a, b, c, r;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //given
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        //when
        r = a + b + c;

        //then
        bw.write(String.valueOf(r));

        br.close();
        bw.close();
    }
}
