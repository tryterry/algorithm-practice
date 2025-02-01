package step.step_2;

import java.io.*;
import java.util.*;


/**
 * 문제 번호: 2753
 * 문제 이름: 윤년
 */
public class q_2753 {
    public static void main(String[] args) throws IOException {
        int a;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        a = Integer.parseInt(br.readLine());

        //when
        if (a % 4 == 0 && ((a % 100 != 0) || (a % 400 == 0))) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.close();
    }
}
