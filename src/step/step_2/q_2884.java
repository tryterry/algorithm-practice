package step.step_2;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 2884
 * 문제 이름: 알람 시계
 */

public class q_2884 {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //given
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        //when
        if (b >= 45) {
            // 45분 이상
            b -= 45;
        } else {
            // 45분 보다 작을 경우
            b = b - 45 + 60;
            if (a > 0) {
                // 0시 보다 클 켱우
                a -= 1;
            } else {
                // 0시 일경우
                a = a - 1 + 24;
            }
        }

        //then

        bw.write(a + " " + b);


        br.close();
        bw.close();
    }
}
