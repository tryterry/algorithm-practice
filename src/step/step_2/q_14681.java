package step.step_2;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 14681
 * 문제 이름: 사분면
 */
public class q_14681 {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        String r;
        //when
        if (a > 0 && b > 0) {
            r = "1";
        } else if (a < 0 && b > 0) {
            r = "2";
        } else if (a > 0 && b < 0) {
            r = "4";
        } else {
            r = "3";
        }

        //then
        bw.write(r);

        br.close();
        bw.close();

    }
}
