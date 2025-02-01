package step.step_2;

import java.io.*;
import java.util.*;

/**
 * 문제 번호: 2525
 * 문제 이름: 오븐 시계
 */
public class q_2525 {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //given
        a = Integer.parseInt(st.nextToken()); // 시
        b = Integer.parseInt(st.nextToken()); // 분
        c = Integer.parseInt(br.readLine()); // 요리 시간

        int r1, r2;
        //when
        if ((b + c) < 60) {
            // 60분 보다 작을 때
            r1 = a;
            r2 = b + c;
        } else { // 60분 보다 클 때
            r2 = (b + c) % 60;
            int h = (b + c) / 60;

            if ((a + h) <= 23) {
                // 23시 보다 작을 때
                r1 = a + h;
            } else {
                // 23시 보다 클 때
                r1 = a + h - 24;
            }
        }

        //then
        bw.write(r1 + " " + r2);


        br.close();
        bw.close();
    }
}
